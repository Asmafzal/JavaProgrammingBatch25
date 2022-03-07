package day52_Map_FunctionalInterface;

public class Test2 {
    public static void main(String[] args) {
        MySecondFunctionalInterface<String> printEach;
        printEach = s -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEach.test("Wooden Spoon");



        MySecondFunctionalInterface<Integer> cube = n -> {
            System.out.println(n*n*n);
        };
        cube.test(3);




    }
}
