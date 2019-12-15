package greeter;

public class TypeInferenceExample {
    public static void main(String[] args) {
//        StringLengthLambda myLambda = s -> s.length();
//        System.out.println(myLambda.getLength("ABC"));

        printLambda((s) -> {
            s = s + "Additional.";
            return s.length();
        });
//        ... is same as (but only one line - supposing we'll have only one line of implementation):
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda stringLengthLambda) {
        System.out.println(stringLengthLambda.getLength("A Lambda!"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
