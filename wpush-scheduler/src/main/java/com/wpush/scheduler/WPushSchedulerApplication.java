package com.wpush.scheduler;

import com.wpush.core.configuration.WPushCoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *@ClassName MainStart
 *@Description TODO
 *@Author ydzhao
 *@Date 2022/8/2 15:44
 */

@SpringBootApplication
@EnableScheduling
@ConfigurationPropertiesScan("com.wpush.core.configuration")
@Import(WPushCoreConfiguration.class)
public class WPushSchedulerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WPushSchedulerApplication.class, args);
    }
}
