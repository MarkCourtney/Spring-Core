package AppContext.Scope;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldXml {

	private static int instance = 0;
	private String propertyString;
	
	// Can on be instantiated by XML config, not java config
	private HelloWorldXml() {
		System.out.println("Private Constuctor.");
	}
	
	private HelloWorldXml(String param) {
		System.out.println("Private Constuctor. w/param " + param);
	}
	
	// MUST NOT be private, other access levels works
	public void setPropertyString(String propertyString) {
		this.propertyString = propertyString;
	}
	
	public String getPropertyString() {
		return this.propertyString;
	}
}
