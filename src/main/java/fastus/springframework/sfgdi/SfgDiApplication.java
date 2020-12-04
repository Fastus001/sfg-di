package fastus.springframework.sfgdi;

import fastus.springframework.sfgdi.controllers.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18mController i18mController = (I18mController) ctx.getBean("i18mController");

		System.out.println("----------I18");

		System.out.println(i18mController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-----------Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-----------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------------Constructor");

		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");

		System.out.println(constructorInjectionController.getGreeting());
	}

}
