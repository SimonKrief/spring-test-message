package demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// to be instaciated:
@Component//("MonInstrumentPrefere")
//choix par défaut lors d'une recherche par type:
@Primary
public class Violon implements Instrument{

	@Override
	public void jouer() {
		System.out.println("Sol Re La Mi");
		
	}

}
