package tlab.spring.mvc.mybatis;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	private static final Logger log = Logger.getLogger(Application.class);
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		SpringApplication.run("classpath:/config/spring-mybatis.xml", args);
	}

	@Override
	public void run(String... args) throws Exception {
		// load spring-beans xml
		
		String userInfo = userService.getUserInfo("0001", "chinyouka");
		log.info(userInfo);
	}

}
