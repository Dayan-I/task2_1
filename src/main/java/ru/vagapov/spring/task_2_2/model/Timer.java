package ru.vagapov.spring.task_2_2.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private final Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
