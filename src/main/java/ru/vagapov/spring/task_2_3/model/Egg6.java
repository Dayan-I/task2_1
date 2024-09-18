package ru.vagapov.spring.task_2_3.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    @Autowired
    private Needle7 needle7;
    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}
