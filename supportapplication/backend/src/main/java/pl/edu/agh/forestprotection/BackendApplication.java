package pl.edu.agh.forestprotection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("app")
public class BackendApplication {

	@Value("${app.serverPath}")
	static private String serverPath;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
