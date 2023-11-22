package ro.fortech.practice;

import java.util.Calendar;

public class InternalCLock {
    public int getHourOfDay() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }
}