package com.talking.clock.util;

import com.talking.clock.exception.InvalidHoursException;
import com.talking.clock.exception.InvalidMinException;

public class TimeUtil {
    public static String timeString(int h, int m){
        String nums[] = { "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen",
                "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen", "Twenty", "Twenty one",
                "Twenty two", "Twenty three", "Twenty four",
                "Twenty five", "Twenty six", "Twenty seven",
                "Twenty eight", "Twenty nine",
        };

        String humanFriendlyText =null;
        if(h > 24){
            throw new InvalidHoursException();
        }
        if(m > 59){
            throw new InvalidMinException();
        }
        switch(m) {
            case  0:
                humanFriendlyText = (h <= 12 ? nums[h] : nums[h - 12]) + " o'clock";
                break;
            case  1:
                humanFriendlyText = "One minute past " + ((h <= 12) ? nums[h] : nums[h - 12]);
                break;
            case  59:
                humanFriendlyText = "One minute to " +nums[(h % 12) + 1];
                break;
            case  15:
                humanFriendlyText = "Quarter past " + ((h <= 12) ? nums[h] : nums[h - 12]);
                break;
            case  30:
                humanFriendlyText = "Half past " + ((h <= 12) ? nums[h] : nums[h - 12]);
                break;
            case  45:
                humanFriendlyText = "Quarter to " +nums[(h % 12) + 1];
                break;
            default:
                if (m <= 30)
                    humanFriendlyText = nums[m] + " past " +((h <= 12) ? nums[h] : nums[h - 12]);

                else if (m > 30)
                    humanFriendlyText = nums[60 - m] + " to " +nums[(h % 12) + 1];
        }
     return humanFriendlyText;
    }
}
