package ro.fortech.practice;

public class Main {
    public static void main(String[] args) {
        GreetingMessageGenerator generator = new GreetingMessageGenerator();
        String message = generator.generateGreetingMessage("Buggs Bunny");
        System.out.println(message);
    }
}