package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Date {
    private int day;
    private int month;
    private int year;
    /** Constructor principal dados day, month y year */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    /** Getters para cada atributo */
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    /** Setters para cada atributo */
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    /** Setter para date */
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    /** toString */
    public String toString() {
        String dayString;
        if (day < 10) {
            dayString = "0" + day;
        }
        else {
            dayString = "" + day;
        }
        String monthString;
        if (month < 10) {
            monthString = "0" + month;
        }
        else {
            monthString = "" + month;
        }
        return dayString + "/" + monthString + "/" + year;

    }
}
