package ru.vagapov.spring.task_2_2.model;

import org.springframework.stereotype.Component;

@Component
public class Dog  extends Animal {
    @Override
    public String toString() {
        return "Я лучший в джаве!!!";
    }
}
