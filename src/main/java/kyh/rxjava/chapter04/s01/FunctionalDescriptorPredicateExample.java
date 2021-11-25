package kyh.rxjava.chapter04.s01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalDescriptorPredicateExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 6, 10, 30, 65, 70, 102);
    List<Integer> result = filter(numbers, n -> n > 30);

    for(int number : result)
      System.out.println(number);
  }

  private static <T> List<T> filter(List<T> numbers, Predicate<T> p){
    List<T> result = new ArrayList<>();
    for(T number : numbers)
      if(p.test(number))
        result.add(number);

    return result;
  }
}
