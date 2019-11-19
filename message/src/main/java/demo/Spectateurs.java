package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

// la bibliothèque org.springframework/spring-aspects a été ajoutée

@Component
@Aspect
@EnableAspectJAutoProxy
public class Spectateurs {
	@Before("execution(* demo.Musicien.jouer(..))")
	public void prendrePlace() {
		System.out.println("Les spectateurs prennent place");
	}
	
	
	@After("execution(* demo.Musicien.jouer(..))")
	public void applaudir() {
		System.out.println("Les spectateurs applaudissent");
	}
}
