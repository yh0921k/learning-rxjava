package kyh.rxjava.chapter03.s03;

import io.reactivex.Maybe;
import io.reactivex.Single;
import kyh.rxjava.utils.DateUtil;
import kyh.rxjava.utils.LogType;
import kyh.rxjava.utils.Logger;

public class MaybeFromSingle {
  public static void main(String[] args){
    Single<String> single = Single.just(DateUtil.getNowDate());
    Maybe.fromSingle(single)
        .subscribe(
            data -> Logger.log(LogType.ON_SUCCESS, "# 현재 날짜시각: " + data),
            error -> Logger.log(LogType.ON_ERROR, error),
            () -> Logger.log(LogType.ON_COMPLETE)
        );
  }
}
