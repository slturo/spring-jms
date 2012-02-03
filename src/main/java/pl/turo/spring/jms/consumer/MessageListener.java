package pl.turo.spring.jms.consumer;

import java.util.List;

/**
 * Date: 03.02.12
 * Time: 12:27
 *
 * @author sturowicz
 */
public interface MessageListener {
    void consumeMessage(String message);

    List<String> getMessages();
}
