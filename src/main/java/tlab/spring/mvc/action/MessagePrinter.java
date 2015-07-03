package tlab.spring.mvc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tlab.spring.mvc.service.MessageService;

@Component
public class MessagePrinter {

	final private MessageService service;

	@Autowired
	public MessagePrinter(MessageService service) {
		this.service = service;
	}

	public void printMessage() {
		String msg = this.service.showMessage();
		System.out.println(msg);
	}

}
