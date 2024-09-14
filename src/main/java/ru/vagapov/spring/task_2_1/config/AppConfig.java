package ru.vagapov.spring.task_2_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.vagapov.spring.task_2_1.model.Cat;
import ru.vagapov.spring.task_2_1.model.HelloSpring;

@Configuration
public class AppConfig {

    @Bean(name = "helloSpring")
    public HelloSpring getHelloWorld() {
        HelloSpring helloWorld = new HelloSpring();
        helloWorld.setMessage("Hello Spring!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype")
    public Cat getCat() {
        return new Cat();
    }

}
