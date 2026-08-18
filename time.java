class Time {
    int Hours;
    int Minutes;

    Time(int hour, int min) {
        this.Hours = hour;
        this.Minutes = min;
    }

    public void add(int hour, int min) {
        Hours += hour;
        Minutes += min;
        if (Hours >= 24) {
            Hours %= 24;
        }
        if (Minutes >= 60) {
            Hours += Minutes / 60;
            Minutes %= 60;
        }
        System.out.println("Time1 + Time2 = " + Hours + ":" + Minutes);
    }

    public void displayTime() {
        System.out.println("Time is : " + this.Hours + ":" + this.Minutes);
    }
}

class timeadd {
    public static void main(String[] args) {
        Time t1 = new Time(15, 30);
        t1.displayTime();
        Time t2 = new Time(15, 35);
        t2.displayTime();
        t1.add(t2.Hours, t2.Minutes);
    }
}
