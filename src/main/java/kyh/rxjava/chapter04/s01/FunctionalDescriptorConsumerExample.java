package kyh.rxjava.chapter04.s01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalDescriptorConsumerExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 6, 10, 30, 65, 70, 102);
    forEachPrint(numbers, n -> System.out.println(n));
  }

  public static <T> void forEachPrint(List<T> numbers, Consumer<T> c) {
    for(T number : numbers)
      c.accept(number);
  }
}
