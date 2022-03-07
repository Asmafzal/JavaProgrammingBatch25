package day53_FunctionalInterface;

@FunctionalInterface
public interface MyThirdFunctionalInterface<T> { // T, R, U are preferred letters for generic name

    T method(T data); //by default public and abstract method...generic method


}
/*
  2. Create a Functional interface named MyThirdFunctionalInterface that has an abstract method takes
  one argument of any type and returns the same type
 */
