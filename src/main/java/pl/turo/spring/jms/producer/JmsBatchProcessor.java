package pl.turo.spring.jms.producer;

/**
 * Date: 27.01.12
 * Time: 14:10
 *
 * @author sturowicz
 */
public interface JmsBatchProcessor {
    
    void sentMessage(String message);

}
