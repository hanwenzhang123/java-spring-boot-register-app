package university;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class MainApplication {
	private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

	public static void main(String[] args) {
		System.out.println("Open http://localhost:8888 in browser");
		System.setProperty("spring.devtools.restart.enabled", "true");

		SpringApplication app = new SpringApplication(MainApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8888"));
		app.run(args);
	}
}
