package tlab.spring.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import tlab.spring.mvc.service.MessageService;

@Configuration
@ComponentScan
public class Application {
	static public ApplicationContext context;

	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String showMessage() {
				return "Hello World!";
			}
		};
	}

//	public static void main(String args[]) {
//		context = new AnnotationConfigApplicationContext(Application.class);
//		MessagePrinter printer = context.getBean(MessagePrinter.class);
//
//		printer.printMessage();
//	}
}
