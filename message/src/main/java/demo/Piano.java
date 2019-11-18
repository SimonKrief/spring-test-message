package demo;

import org.springframework.stereotype.Component;

//to be instaciated:
//@Component
public class Piano implements Instrument {

	@Override
	public void jouer() {
System.out.println("ta ta tata");		
	}

}
