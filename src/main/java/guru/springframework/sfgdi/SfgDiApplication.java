package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorGreetingController;
import guru.springframework.sfgdi.controllers.GenericGreetingController;
import guru.springframework.sfgdi.controllers.PropertyGreetingController;
import guru.springframework.sfgdi.controllers.SetterGreetingController;
import guru.springframework.sfgdi.services.GreetingSeviceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		/*System.out.println("------ Primary");
		GenericGreetingController prController = (GenericGreetingController) ctx.getBean("genericGreetingController");

		System.out.println(prController.getGreeting());*/

		System.out.println("------ Property");
		PropertyGreetingController pController = (PropertyGreetingController)ctx.getBean("propertyGreetingController");

		System.out.println(pController.getGreeting());

		System.out.println("------ Setter");
		SetterGreetingController sController = (SetterGreetingController) ctx.getBean("setterGreetingController");

		System.out.println(sController.getGreeting());

		System.out.println("------ Constructor");
		ConstructorGreetingController cController = (ConstructorGreetingController) ctx.getBean("constructorGreetingController");

		System.out.println(cController.getGreeting());
	}

}
