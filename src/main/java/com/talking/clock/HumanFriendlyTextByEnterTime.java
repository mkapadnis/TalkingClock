package com.talking.clock;

import com.talking.clock.exception.InvalidInputException;
import com.talking.clock.util.TimeUtil;

import java.util.Scanner;

public class HumanFriendlyTextByEnterTime {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Please Enter time. Ex 1:00");
            String time = in.next();
            String timeArray[] = time.split(":");
            int h = Integer.parseInt(timeArray[0]);
            int m = Integer.parseInt(timeArray[1]);
            System.out.println(TimeUtil.timeString(h, m));
        }catch (Exception e){
           throw new InvalidInputException("Invalid Input. Ex. 1:00");
        }
        }
    }


