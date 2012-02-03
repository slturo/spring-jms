package pl.turo.spring.jms.producer;

import org.springframework.jms.core.JmsTemplate;

/**
 * Date: 27.01.12
 * Time: 14:11
 *
 * @author sturowicz
 */
public class JmsBatchProcessorImpl implements JmsBatchProcessor {

    private JmsTemplate jmsTemplate;

    public JmsBatchProcessorImpl(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sentMessage(String message) {
        jmsTemplate.convertAndSend(message);
    }
}
