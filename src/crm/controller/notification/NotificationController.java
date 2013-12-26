package crm.controller.notification;

import javax.inject.Named;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Named
@RequestMapping("/notifications")
public class NotificationController {
	@RequestMapping(method=RequestMethod.GET)
	public String get() {
		return "notification";
	}
}
