package ro.fortech.practice;

public class GreetingMessageGenerator {
    private final InternalCLock clock = new InternalCLock();

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
        int hourOfDay = clock.getHourOfDay();
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
}