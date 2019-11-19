package message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import message.Message;

@ComponentScan
public class ApplicationConfig {
	// ceci est une BeanFactory,
	// On n'est plus obligé de déclarer Message comme un composanst
	//par default, on obtient un singleton
	@Bean@Scope("prototype")
	public Message message() {
		return new Message();
	}

}
