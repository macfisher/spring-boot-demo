package com.macfisher;

import com.abc.foo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * \@SpringBootApplication annotates that this class will handle the config. of
 * beans for the package that it is in. This seems similar to a Composition
 * Root, in relation to other common architectures. The annotation is a
 * combination of the following annotations:
 * \@Configuration
 * \@EnableAutoConfiguration
 * \@ComponentScan -- scans for components, configs., and services in package
 */

@ComponentScan({"com.macfisher", "com.abc.foo"})
@SpringBootApplication
@EnableConfigurationProperties
public class SpringBeansApplication // bean definitions for app. context
{
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication
                                    .run(SpringBeansApplication.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);

        for (String name : beanNames)
            System.out.println(name);

        System.out.println(ctx.getBean("user").toString());

        MyAppConfig config = (MyAppConfig) ctx.getBean("myAppConfig");
        System.out.println(config.toString());
    }

    @Bean
    public User user() { return new User("Mac", "Fisher"); }
}
