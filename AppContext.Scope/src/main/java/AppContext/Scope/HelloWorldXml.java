package AppContext.Scope;

public class HelloWorldXml {

	private String propertyString;
	
	// Can on be instantiated by XML config, not java config
	private HelloWorldXml() {
		System.out.println("HelloWorldXml: Private Constuctor.");
	}
	
	private HelloWorldXml(String param) {
		System.out.println("HelloWorldXml: Private Constuctor. w/param " + param);
	}
	
	public void setPropertyString(String propertyString) {
		this.propertyString = propertyString;
	}
	
	public String getPropertyString() {
		return this.propertyString;
	}
}
