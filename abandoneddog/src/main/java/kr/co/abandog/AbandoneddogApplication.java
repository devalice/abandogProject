package kr.co.abandog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AbandoneddogApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbandoneddogApplication.class, args);
	}

}
