package message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan
public class MainMessage {
	public static void main(String[] args) {



		try (AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {
			// problème de couplage
// 			EmailSender renardDeFeu = ctx.getBean(EmailSender.class);
			
			//utilisation de la classe abstraite
			//Remarque: on ne doit pas mettre une majuscule
			MessageSender renardDeFeu = ctx.getBean("emailSender",MessageSender.class);

			Message email = ctx.getBean(Message.class);
			renardDeFeu.send(email);



		}
	}
}
