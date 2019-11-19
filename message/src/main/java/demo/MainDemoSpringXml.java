package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@ComponentScan
public class MainDemoSpringXml {

	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("config2.xml");
//		Musicien musicien = ctx.getBean(Musicien.class);
//		musicien.jouer();
		
		try (AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(MainDemoSpringXml.class)){
			Musicien musicien = ctx.getBean(Musicien.class);
			musicien.jouer();
		}
	}

}
