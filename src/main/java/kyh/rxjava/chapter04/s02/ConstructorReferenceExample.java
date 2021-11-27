package kyh.rxjava.chapter04.s02;

import kyh.rxjava.commons.Car;

import java.util.function.Function;

public class ConstructorReferenceExample {
  public static void main(String[] args) {
    Function<String, Car> f1 = s -> new Car(s);
    Car car1 = f1.apply("콜로라도");
    System.out.println(car1.getCarName());

    Function<String, Car> f2 = Car::new;
    Car car2 = f2.apply("카니발");
    System.out.println(car2.getCarName());
  }
}
