package kyh.rxjava.chapter03.s02;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import kyh.rxjava.utils.LogType;
import kyh.rxjava.utils.Logger;
import kyh.rxjava.utils.TimeUtil;

import java.util.concurrent.TimeUnit;

public class MissingBackpressureExceptionExample {
  public static void main(String[] args) throws InterruptedException {
    Flowable.interval(1L, TimeUnit.MILLISECONDS)
        .doOnNext(data -> Logger.log(LogType.DO_ON_NEXT, data))
        .observeOn(Schedulers.computation())
        .subscribe(
            data -> {
              Logger.log(LogType.PRINT, "# 소비자 처리 대기중..");
              TimeUtil.sleep(1000L);
              Logger.log(LogType.ON_NEXT, data);
            },
            error -> Logger.log(LogType.ON_ERROR, error),
            () -> Logger.log(LogType.ON_COMPLETE));

    Thread.sleep(2000L);
  }
}
