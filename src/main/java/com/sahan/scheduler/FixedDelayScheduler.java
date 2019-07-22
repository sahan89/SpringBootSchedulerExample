package com.sahan.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class FixedDelayScheduler {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void scheduleFixedRateTask() {
        System.out.println("scheduleFixedRateTask -->> " + dateFormat.format(new Date()));
    }

    @Scheduled(fixedDelay = 5000)
    public void scheduleFixedDelayTask() {
        System.out.println("scheduleFixedDelayTask -->> " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "2 * * * * ?")
    public void scheduleTaskUsingCronExpression() {
        System.out.println("scheduleTaskUsingCronExpression -->> " + dateFormat.format(new Date()));
    }
}
