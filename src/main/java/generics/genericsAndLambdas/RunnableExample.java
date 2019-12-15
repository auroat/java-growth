package generics.genericsAndLambdas;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            System.out.println("Hello!");
            System.out.println("Yeah, from Runnable!");
        });

        myThread.run();
    }
}
