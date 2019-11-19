package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//to be instaciated:
@Component
public class Musicien {
	@Value("Au Glaire de ta lune")
	private String partition;

//	@Autowired@Qualifier("MonInstrumentPrefere")
	@Autowired
	private Instrument instrument;

	// ajout d'un constructeur, le piano est passé dans la methode,
	// mais le violon est considéré comme composant primaire...
	@Autowired
	public Musicien(@Qualifier("piano") Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	public void jouer() {
		System.out.println("partition: " + partition);
		instrument.jouer();
	}

	public String getPartition() {
		return partition;
	}

	public void setPartition(String partition) {
		this.partition = partition;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
