package com.jack.ch3;

import com.jack.util.LogType;
import com.jack.util.Logger;
import com.jack.util.TimeUtil;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class MissingBackpressure {
    public static void main(String[] args) throws InterruptedException {
        Flowable.interval(1L, TimeUnit.MILLISECONDS)
                .doOnNext(data -> Logger.log(LogType.DO_ON_NEXT, data))
                .observeOn(Schedulers.computation())
                .subscribe(
                        data -> {
                            System.out.println("# 소비자 처리 대기 중");
                            TimeUtil.sleep(1000l);
                            Logger.log(LogType.ON_SUBSCRIBE, data);
                        },
                        error -> Logger.log(LogType.ON_ERROR, error)
                );

        Thread.sleep(2000l);
    }
}
