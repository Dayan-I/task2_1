package ru.vagapov.spring.task_2_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.vagapov.spring.task_2_1.config.AppConfig;
import ru.vagapov.spring.task_2_1.model.Cat;
import ru.vagapov.spring.task_2_1.model.HelloSpring;

public class SpringApplication_2_1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloSpring bean =
                (HelloSpring) applicationContext.getBean("helloSpring");
        HelloSpring anotherBean =
                (HelloSpring) applicationContext.getBean("helloSpring");
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat anotherCatBean = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == anotherBean);
        System.out.println(catBean == anotherCatBean);
    }

}
