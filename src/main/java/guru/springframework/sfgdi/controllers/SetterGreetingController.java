package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterGreetingController
{
	private GreetingService	greetingService;

	@Qualifier("setterServiceImplementation")
	@Autowired
	public void setGreetingService(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String	getGreeting()
	{
		return (greetingService.sayHello());
	}
}
