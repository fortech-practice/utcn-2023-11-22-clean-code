package ro.fortech.practice.clock;

import java.time.LocalDateTime;

public class OtherInternalClock implements Clock {
    @Override
    public int getHourOfDay() {
        return LocalDateTime.now().getHour();
    }
}