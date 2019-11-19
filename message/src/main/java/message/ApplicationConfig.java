package message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import message.Message;

@ComponentScan
public class ApplicationConfig {
	// ceci est une BeanFactory :
	@Bean	public Message message() {
		return new Message();
	}

}
