package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingSeviceImplementation implements GreetingService
{
	@Override
	public String sayHello()
	{
		return ("Hello World !!! (Default)");
	}
}
