package ru.vagapov.spring.task_2_1.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.vagapov.spring.task_2_1.model.Cat;
import ru.vagapov.spring.task_2_1.model.HelloSpring;

@Configuration
public class AppConfig {
    public static final String HELLO_WORLD = "Hello World";
    public static final String CAT = "Cat";
    @Bean(name = HELLO_WORLD)
    public HelloSpring getHelloWorld() {
        HelloSpring helloWorld = new HelloSpring();
        helloWorld.setMessage("Hello Spring!");
        return helloWorld;
    }

    @Bean(name = CAT)
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Cat getCat() {
        return new Cat();
    }

}
