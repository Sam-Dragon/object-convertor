package learn.model.mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "learn.lombok.service.employee")
public class ModelMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelMapperApplication.class, args);
	}

}
