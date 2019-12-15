package greeter;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello Multi-verse!");

        lambdaGreeting.perform();
        helloWorldGreeting.perform();

        greeter.greet(lambdaGreeting);
    }
}
