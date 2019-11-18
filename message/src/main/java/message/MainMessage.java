package message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainMessage {
	public static void main(String[] args) {
		//ce que nous faisions avant:
//		EmailSender renardDeFeu = new EmailSender();
//		Message email = new Message();
//		email.setText("Salut c'est cool");
//		renardDeFeu.send(email);
		
		//ce que nous faisons mainenant:
		
		try( AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml")){;
		
		EmailSender renardDeFeu = ctx.getBean(EmailSender.class);
		Message email = ctx.getBean(Message.class);

		renardDeFeu.send(email);
//		ctx.close(); // automatique grace au try
		}
	}

}
