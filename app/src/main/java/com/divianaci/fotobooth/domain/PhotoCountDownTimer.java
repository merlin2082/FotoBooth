package com.divianaci.fotobooth.domain;

import android.content.Context;
import android.os.CountDownTimer;

/**
 * Created by Merlin on 3/8/2015.
 */
public class PhotoCountDownTimer extends CountDownTimer {

    public static final Long MAX_SECONDS = 30L;
    public static final Long SECONDS_PER_MILLISECOND = 1000L;
    public static final Long DECREMENT_PROPORTION = 2L;

    private Long startTime;
    private Long interval = 1000L;
    private Long timeRemaining;
    private Context parentContext;

    public PhotoCountDownTimer(Long startTime, Long interval, Context parentContext) {
        super(startTime, interval);

        this.startTime = startTime;
        this.interval = interval;
    }

    @Override
    public void onFinish() {
        //TODO return timer finished intent
        //parentContext.sendBroadcast()

    }

    @Override
    public void onTick(long millisUntilFinished) {
        //TODO notify progress bar
        timeRemaining = millisUntilFinished;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public Long getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(Long timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public Context getParentContext() {
        return parentContext;
    }

    public void setParentContext(Context parentContext) {
        this.parentContext = parentContext;
    }
}
