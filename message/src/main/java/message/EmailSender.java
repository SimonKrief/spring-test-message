package message;

public class EmailSender implements MessageSender{

	@Override
	public void send(Message message) {
		System.out.println(message.getText());
	}

}
