package appliweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="appliweb")
@EnableAutoConfiguration
public class AppTest {

	public static void main(String[] args) {

		SpringApplication appli = new SpringApplication(AppTest.class);
		appli.run(args);

	}

}
