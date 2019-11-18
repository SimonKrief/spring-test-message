package message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class MainMessage {
	public static void main(String[] args) {

//		//ce que nous faisions avant:
//		try( AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml")){
//		
//		EmailSender renardDeFeu = ctx.getBean(EmailSender.class);
//		Message email = ctx.getBean(Message.class);
//
//		renardDeFeu.send(email);
//		}

		try (AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(MainMessage.class)) {
			EmailSender renardDeFeu = ctx.getBean(EmailSender.class);
			Message email = ctx.getBean(Message.class);
			renardDeFeu.send(email);

		}
	}
}
