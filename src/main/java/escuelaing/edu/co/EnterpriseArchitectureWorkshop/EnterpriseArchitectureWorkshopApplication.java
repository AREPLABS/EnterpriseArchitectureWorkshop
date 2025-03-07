package escuelaing.edu.co.EnterpriseArchitectureWorkshop;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnterpriseArchitectureWorkshopApplication {

	public static void main(String[] args) { 
		SpringApplication app = new SpringApplication(EnterpriseArchitectureWorkshopApplication.class); 
		app.setDefaultProperties(Collections.singletonMap("server.port", "5000")); 
		app.run(args); 
	}

}
