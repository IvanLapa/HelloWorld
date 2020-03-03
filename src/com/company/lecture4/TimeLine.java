package com.company.lecture4;

public class TimeLine {
    int seconds;
    int minutes;
    int hours;

    public TimeLine(int seconds){
        this.seconds = seconds;
    }
    public TimeLine (int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getSecondsFromFullTime (int hours, int minutes, int seconds) {
        int full_time = hours*3600 + minutes*60 + seconds;
        return full_time;
    }
    public void outputTime (int time){
        System.out.println(time);
    }


    public static void main (String[] args){
        TimeLine Time = new TimeLine(2,40,30);
        int q = Time.getSecondsFromFullTime(2,40,50);
        Time.outputTime(q);
        Time.outputTime(Time.getSecondsFromFullTime(2,40,50));
    }

}
