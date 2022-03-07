package day53_FunctionalInterface;

public class LambdaExpressions {
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
                    String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;
                };

        String result = stringReverse.method("Wooden Spoon");
        System.out.println("result = " + result);
    }
}
/*
  2.1 Create a class named Test and use the custom functional interface above to create the following functions:
                1. Create a function that takes one integer and returns the cube of the given argument
                2. Create a function that takes a String and returns the reversed value of the given argument
 */
