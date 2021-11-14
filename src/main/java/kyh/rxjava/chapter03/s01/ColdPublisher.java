package kyh.rxjava.chapter03.s01;

import io.reactivex.Flowable;

public class ColdPublisher {
  public static void main(String[] args) {
    Flowable<Integer> flowable = Flowable.just(1, 2, 3, 4);

    flowable.subscribe(data -> System.out.println("Subscriber 1 : " + data));
    flowable.subscribe(data -> System.out.println("Subscriber 2 : " + data));
  }
}
