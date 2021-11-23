package kyh.rxjava.chapter03.s03;

import io.reactivex.Single;
import kyh.rxjava.utils.DateUtil;
import kyh.rxjava.utils.LogType;
import kyh.rxjava.utils.Logger;

public class SingleLambdaExample {
  public static void main(String[] args){
    Single<String> single = Single.create(emitter -> emitter.onSuccess(DateUtil.getNowDate()));

    single.subscribe(
        data -> Logger.log(LogType.ON_SUCCESS, "# 날짜시각: " + data),
        error -> Logger.log(LogType.ON_ERROR, error)
    );
  }
}
