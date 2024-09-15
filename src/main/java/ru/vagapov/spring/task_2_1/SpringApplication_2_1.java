package ru.vagapov.spring.task_2_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.vagapov.spring.task_2_1.config.AppConfig;
import ru.vagapov.spring.task_2_1.model.Cat;
import ru.vagapov.spring.task_2_1.model.HelloSpring;

import static ru.vagapov.spring.task_2_1.config.AppConfig.CAT;
import static ru.vagapov.spring.task_2_1.config.AppConfig.HELLO_WORLD;

public class SpringApplication_2_1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloSpring bean =
                (HelloSpring) applicationContext.getBean(HELLO_WORLD);
        HelloSpring anotherBean =
                (HelloSpring) applicationContext.getBean(HELLO_WORLD);
        Cat catBean = (Cat) applicationContext.getBean(CAT);
        Cat anotherCatBean = (Cat) applicationContext.getBean(CAT);
        System.out.println(bean == anotherBean);
        System.out.println(catBean == anotherCatBean);
    }

}
