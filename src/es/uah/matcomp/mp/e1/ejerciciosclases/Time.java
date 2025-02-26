package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Time {
    private int hour;
    private int minute;
    private int second;
    /** Constructor principal dados hour, minute y second */
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    /** Getters para cada atributo */
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    /** Setters para cada atributo */
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    /** Método setter para Time dados hour,minute y second */
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    /** toString */
    public String toString() {
        String hourString;
        if (hour < 10) {
            hourString = "0" + hour;
        }
        else {
            hourString = "" + hour;
        }
        String minuteString;
        if (minute < 10) {
            minuteString = "0" + minute;
        }
        else {
            minuteString = "" + minute;
        }
        String secondString;
        if (second < 10) {
            secondString = "0" + second;
        }
        else {
            secondString = "" + second;
        }
        return hourString + ":" + minuteString + ":" + secondString;
    }
    /** Método que devuelve Time con un segundo más */
    public Time nextSecond() {
        second += 1;

        if (second == 60) {
            second = 0;
            minute += 1;
            if (minute == 60) {
                minute = 0;
                hour += 1;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
    /** Método que devuelve la hora hace un segundo */
    public Time previousSecond() {
        second -= 1;
        if (second < 0) {
            second = 59;
            minute -= 1;
            if (minute < 0) {
                minute = 59;
                hour -= 1;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }


}
