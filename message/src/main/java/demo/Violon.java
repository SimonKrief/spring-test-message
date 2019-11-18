package demo;

import org.springframework.stereotype.Component;
// to be instaciated:
//@Component("MonInstrumentPrefere")
public class Violon implements Instrument{

	@Override
	public void jouer() {
		System.out.println("Sol Fa Si la Si Re");
		
	}

}
