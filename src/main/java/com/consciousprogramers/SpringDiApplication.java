package com.consciousprogramers;

import com.consciousprogramers.controller.ConstructorInjectedController;
import com.consciousprogramers.controller.MyController;
import com.consciousprogramers.controller.PropertyInjectedController;
import com.consciousprogramers.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

        System.out.println(context.getBean(MyController.class).primaryGreet());
        System.out.println(context.getBean(PropertyInjectedController.class).greet());
        System.out.println(context.getBean(SetterInjectedController.class).greet());
        System.out.println(context.getBean(ConstructorInjectedController.class).greet());
    }
}
