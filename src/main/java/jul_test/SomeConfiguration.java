package jul_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfiguration {

    @Bean
    public SomeBeanWithLogger someBean() {
        return new SomeBeanWithLogger();
    }

}
