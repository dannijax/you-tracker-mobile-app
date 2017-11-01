package com.oluwadara.ojoodide.youtrackmobile.data.models.scheduler;

import io.reactivex.Scheduler;

public interface SchedulerProvider {
    Scheduler io();
    Scheduler ui();
    Scheduler computation();

}
