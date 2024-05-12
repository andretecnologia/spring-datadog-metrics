package com.example.Datadog.configuration;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimedAspectConfiguration {

    @Bean
    public TimedAspect timedAspect(MeterRegistry registry) {
        return new TimedAspect(registry);
    }

    /*

    Aqui vamos disponibilizar uma annotation conforme instruções do site oficial Micrometer

    https://micrometer.io/docs/concepts

    Item 11 Timers

    Para usá-la teremos que adicionar a depedência aspects no maven

    	<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aspects</artifactId>
		</dependency>

     */

}
