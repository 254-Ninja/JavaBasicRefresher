package com.example.javabasicrefresher;

import java.util.Calendar;

//Date object using the calendar class
public class dataObjectUsingCalendarClass {

    public static void main(String[] args){
        int year = 2022;
        int month = 0; //January
        int date = 1;

        Calender cal = Calendar.getInstance();

        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);


    }
}
