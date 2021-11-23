package kyh.rxjava.chapter03.s03;

import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.disposables.Disposable;
import kyh.rxjava.utils.LogType;
import kyh.rxjava.utils.Logger;

public class MaybeCreateExample {
  public static void main(String[] args){
    Maybe<String> maybe = Maybe.create(new MaybeOnSubscribe<String>() {
      @Override
      public void subscribe(MaybeEmitter<String> emitter) throws Exception {
      // emitter.onSuccess(DateUtil.getNowDate());

        emitter.onComplete();
      }
    });

    maybe.subscribe(new MaybeObserver<String>() {
      @Override
      public void onSubscribe(Disposable disposable) {
        // 아무것도 하지 않음.
      }

      @Override
      public void onSuccess(String data) {
        Logger.log(LogType.ON_SUCCESS, "# 현재 날짜시각: " + data);
      }

      @Override
      public void onError(Throwable error) {
        Logger.log(LogType.ON_ERROR, error);
      }

      @Override
      public void onComplete() {
        Logger.log(LogType.ON_COMPLETE);
      }
    });
  }
}
