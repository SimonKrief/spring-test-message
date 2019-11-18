package message;

public class SmsSender implements MessageSender{

	@Override
	public void send(Message message) {
		System.out.println(message.getText());
	}

}
