package labpadroesProjetosSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Spring Boot project generated via initializr.
 * ## Selected modules:
 * - Spring Data JPA;
 * - Spring Web;
 * - H2;
 * - OpenFeign;
 *
 * @author josivantarcio
 *
 */

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetosSpringApplication.class, args);
	}

}
