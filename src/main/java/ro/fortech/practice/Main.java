package ro.fortech.practice;

import ro.fortech.practice.clock.Clock;
import ro.fortech.practice.clock.InternalCLock;

public class Main {
    public static void main(String[] args) {
        Clock clock = new InternalCLock();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);
        String message = generator.generateGreetingMessage("Tweety Bird");
        System.out.println(message);
    }
}