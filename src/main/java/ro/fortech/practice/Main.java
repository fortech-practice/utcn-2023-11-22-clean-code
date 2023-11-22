package ro.fortech.practice;

public class Main {
    public static void main(String[] args) {
        GreetingMessageGenerator generator = new GreetingMessageGenerator();
        String message = generator.generateGreetingMessage("Tweety Bird");
        System.out.println(message);
    }
}