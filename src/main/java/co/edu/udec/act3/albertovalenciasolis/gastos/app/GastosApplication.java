package co.edu.udec.act3.albertovalenciasolis.gastos.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "co.edu.udec.act3.albertovalenciasolis.gastos")
@EntityScan(basePackages = "co.edu.udec.act3.albertovalenciasolis.gastos.model")
@EnableJpaRepositories(basePackages = "co.edu.udec.act3.albertovalenciasolis.gastos.repository")
public class GastosApplication {
	public static void main(String[] args) {
		SpringApplication.run(GastosApplication.class, args);
	}

}
