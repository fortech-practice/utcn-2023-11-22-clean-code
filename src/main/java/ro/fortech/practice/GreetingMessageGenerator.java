package ro.fortech.practice;

import java.util.Calendar;

public class GreetingMessageGenerator {
    public String generateGreetingMessage() {
        return generateGreetingMessage(null);
    }

    public String generateGreetingMessage(String personName) {
        if (personName == null) {
            return "Good " + getMomentOfDay() + ", stranger!";
        }
        return "Good " + getMomentOfDay() + ", " + personName + "!";
    }

    private String getMomentOfDay() {
        int hourOfDay = getHourOfDay();
        if ((5 <= hourOfDay) && (hourOfDay < 12)) {
            return "morning";
        }
        if ((12 <= hourOfDay) && (hourOfDay < 18)) {
            return "afternoon";
        }
        if ((18 <= hourOfDay) && (hourOfDay < 22)) {
            return "evening";
        }
        return "night";
    }

    private int getHourOfDay() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }
}