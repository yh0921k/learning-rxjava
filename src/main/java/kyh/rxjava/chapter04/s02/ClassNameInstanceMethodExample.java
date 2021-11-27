package kyh.rxjava.chapter04.s02;

import kyh.rxjava.commons.Car;

import java.util.function.Function;

public class ClassNameInstanceMethodExample {
  public static void main(String[] args) {
    Function<Car, String> f1 = car -> car.getCarName();
    String carName1 = f1.apply(new Car("트래버스"));
    System.out.println(carName1);

    Function<Car, String> f2 = Car::getCarName;
    String carName2 = f2.apply(new Car("팰리세이드"));
    System.out.println(carName2);
  }
}
