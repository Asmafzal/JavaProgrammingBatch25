package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> { //predicate takes one argument and returns boolean
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");

        System.out.println("_________________________________________________________________");

        Predicate<Integer> isEven = p -> p % 2 == 0;

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));

        list.removeIf(isEven);

        System.out.println(list);

        System.out.println("_______________________________________________________________________");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("level", "Anna", "java", "python"));

        names.removeIf(isPalindrome);

        System.out.println(names);

        System.out.println("------------------------------------------------------------------------------");

        Consumer<String> printEach = (s) -> {  //consumer is a functional interface
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("---------------------------------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));

        list2.forEach(p -> System.out.println(p));

        list2.forEach(p -> {
            if (p % 2 != 0) System.out.println(p);
        });

        System.out.println("-----------------------------------------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Asma Afzal", "Sinem Kaya", "Tanya Elliot", "Zorig Batzorig"));
        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

        System.out.println("-----------------------------------------------------------------------------");

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        System.out.println("-----------------------------------------------------------------------------");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);

        System.out.println("-----------------------------------------------------------------------------");

        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result[i] = a.get(i);
            }
            return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int[] result2 = convertToArray.apply(numbers);


    }
}
