package message;

import org.springframework.stereotype.Component;

//to be instaciated:
@Component
public class EmailSender implements MessageSender{

	@Override
	public void send(Message message) {
		System.out.println(message.getText());
	}

}
