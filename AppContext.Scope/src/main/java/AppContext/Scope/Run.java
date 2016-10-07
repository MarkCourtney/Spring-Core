package AppContext.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Run {

	@Autowired
	@Qualifier("autowiring")
	private AutowiringExample autowiringExampleByField;
	
	private AutowiringExample autowiringExampleBySetter;
	private AutowiringExample autowiringExampleByConstructor;
	
	@Autowired
	public Run(AutowiringExample autowiringExampleByConstructor) {
		this.autowiringExampleByConstructor = autowiringExampleByConstructor;
	}
	
	public void printTypesOfAutoWire() {
		System.out.println("RunByField:       " + autowiringExampleByField);
		System.out.println("RunBySetter:      " + autowiringExampleBySetter);
		System.out.println("RunByConstructor: " + autowiringExampleByConstructor);
	}
	
	@Autowired
	@Qualifier("autowiring")
	private void setAutowiringExampleBySetter(AutowiringExample autowiringExampleBySetter) {
		this.autowiringExampleBySetter = autowiringExampleBySetter;
	}
}
