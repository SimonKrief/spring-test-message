package message;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainMessage {
	public static void main(String[] args) {

		try (AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {
			
			//utilisation de la classe abstraite
			//Remarque: on ne doit pas mettre une majuscule
			MessageSender renardDeFeu = ctx.getBean("emailSender",MessageSender.class);
			MessageSender _3310 = ctx.getBean("smsSender",MessageSender.class);

			Message email = ctx.getBean(Message.class);
			email.setText("Salut");

			Message sms =  ctx.getBean(Message.class);
			sms.setText("wesh");
			
			
			//En l'absence de l'annotation "prototype" sur le BeanFactory, 
			//on obtient le même message
			renardDeFeu.send(email);
			_3310.send(sms);


		}
	}
}
