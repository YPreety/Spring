package ConfigurationJavaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

	@Bean(name="myColorBean")
    public MyColor getMyColors(){
        return new RedColor();
    }
}
