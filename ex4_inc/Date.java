package ex4_inc;

public class Date {
    private int day;
    private int mounth;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMounth() {
        return mounth;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) {
            this.day = day;
        }
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
