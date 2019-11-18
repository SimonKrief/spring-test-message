package message;

import org.springframework.stereotype.Component;

//to be instaciated:
@Component
public interface MessageSender {
void send(Message message);
}
