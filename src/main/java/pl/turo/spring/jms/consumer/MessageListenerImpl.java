package pl.turo.spring.jms.consumer;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 03.02.12
 * Time: 12:29
 *
 * @author sturowicz
 */
public class MessageListenerImpl implements MessageListener {
    private List<String> messages = new ArrayList<String>();

    @Override
    public void consumeMessage(String message) {
        messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }
}
