package kyh.rxjava.chapter03.s02;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import kyh.rxjava.utils.LogType;
import kyh.rxjava.utils.Logger;
import kyh.rxjava.utils.TimeUtil;

import java.util.concurrent.TimeUnit;

public class BackpressureLatestExample {
  public static void main(String[] args){
    Flowable.interval(300L, TimeUnit.MILLISECONDS)
            .doOnNext(data -> Logger.log("#inverval doOnNext()", data))
            .onBackpressureLatest()
            .observeOn(Schedulers.computation(), false, 1)
            .subscribe(
                    data -> {
                      TimeUtil.sleep(1000L);
                      Logger.log(LogType.ON_NEXT, data);
                    },
                    error -> Logger.log(LogType.ON_ERROR, error)
            );

    TimeUtil.sleep(5500L);
  }
}
