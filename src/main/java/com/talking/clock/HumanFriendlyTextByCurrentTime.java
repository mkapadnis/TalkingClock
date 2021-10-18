package com.talking.clock;

import com.talking.clock.util.TimeUtil;

import java.util.Calendar;

public class HumanFriendlyTextByCurrentTime {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int h = now.get(Calendar.HOUR_OF_DAY);
        int m = now.get(Calendar.MINUTE);
        System.out.println(TimeUtil.timeString(h, m));
    }
}


