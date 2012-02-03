package pl.turo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.turo.spring.jms.consumer.MessageListener;
import pl.turo.spring.jms.producer.JmsBatchProcessor;

import java.util.Locale;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    @Autowired
    private JmsBatchProcessor jmsBatchProcessor;

    @Autowired
    private MessageListener messageListener;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
        model.addAttribute("messages", messageListener.getMessages());
		return "home";
    }
	

    @RequestMapping(value = "/sent", method = RequestMethod.GET)
    public String sentMessage(@RequestParam("value") String message, Model model) {
        jmsBatchProcessor.sentMessage(message);
        return "redirect:/";
    }
}
