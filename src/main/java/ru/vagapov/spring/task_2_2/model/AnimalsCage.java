package ru.vagapov.spring.task_2_2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    private Timer time;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public String getMessage() {
        return animal.toString();
    }

    public Timer getTimer() {
        return time;
    }
}
