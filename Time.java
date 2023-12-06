public class Time {
    private int hr;
    private int min;
    Time(int hr, int min) {
        hr = hr;
        min = min;
    }
    public static Time addTime(Time t1, Time t2) {
        int min = t1.min + t2.min;
        int hr = t1.hr + t2.hr + min / 60;
        min = min % 60;
        return new Time(hr, min);
    }
    public void display() {
        System.out.println(this.hr + " hours and " + this.min + " minutes");
    }
}

