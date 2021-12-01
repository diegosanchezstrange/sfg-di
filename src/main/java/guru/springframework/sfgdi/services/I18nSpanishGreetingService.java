package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18n")
public class I18nSpanishGreetingService implements GreetingService
{
	@Override
	public String sayHello()
	{
		return ("Hola Mundo !!!");
	}
}
