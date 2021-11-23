package kyh.rxjava.chapter03.s03;

import io.reactivex.Maybe;
import kyh.rxjava.utils.DateUtil;
import kyh.rxjava.utils.LogType;
import kyh.rxjava.utils.Logger;

public class MaybeLambdaExample {
  public static void main(String[] args){
    Maybe<String> maybe = Maybe.create(emitter -> {
      emitter.onSuccess(DateUtil.getNowDate());
//            emitter.onComplete();
    });

    maybe.subscribe(
        data -> Logger.log(LogType.ON_SUCCESS, "# 현재 날짜시각: " + data),
        error -> Logger.log(LogType.ON_ERROR, error),
        () -> Logger.log(LogType.ON_COMPLETE)
    );
  }
}
