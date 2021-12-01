package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorServiceImplementation implements GreetingService
{
	@Override
	public String sayHello()
	{
		return ("Hello World !!! (Constructor)");
	}
}
