package ro.fortech.practice.clock;

import java.util.Calendar;

public class InternalCLock implements Clock {
    @Override
    public int getHourOfDay() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }
}