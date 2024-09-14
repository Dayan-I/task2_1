package ru.vagapov.spring.task_2_1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.vagapov.spring.task_2_1.config.AppConfig;
import ru.vagapov.spring.task_2_1.model.Cat;
import ru.vagapov.spring.task_2_1.model.HelloSpring;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class SpringApplicationOneTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        HelloSpring tree =
                applicationContext.getBean(HelloSpring.class);
        HelloSpring leaf =
                applicationContext.getBean(HelloSpring.class);
        Assert.assertSame("Тест провален, некорректная настройка бина HelloSpring", tree, leaf);

        Cat one = applicationContext.getBean(Cat.class);
        Cat two = applicationContext.getBean(Cat.class);
       Assert.assertNotSame("Тест провален, некорректная настройка бина Cat", one, two);
    }

}
