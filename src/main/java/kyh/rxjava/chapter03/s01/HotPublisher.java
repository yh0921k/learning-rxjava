package kyh.rxjava.chapter03.s01;

import io.reactivex.processors.PublishProcessor;

public class HotPublisher {
  public static void main(String[] args) {
    PublishProcessor<Integer> processor = PublishProcessor.create();
    processor.subscribe(data -> System.out.println("Subscriber 1 : " + data));
    processor.onNext(1);
    processor.onNext(2);

    processor.subscribe(data -> System.out.println("Subscriber 2 : " + data));
    processor.onNext(3);
    processor.onNext(4);

    processor.onComplete();
  }
}

