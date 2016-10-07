package AppContext.Scope;

public class HelloWorldJavaConfig {

	private static int instance = 0;
	private String propertyString;
	
	// Can on be instantiated by XML config, not java config
	public HelloWorldJavaConfig() {
		System.out.println("HelloWorldJavaConfig: Public Constuctor.");
	}

	protected HelloWorldJavaConfig(String param) {
		System.out.println("HelloWorldJavaConfig: Protected Constuctor w/param: " + param);
	}
	
	void setPropertyString(String propertyString) {
		this.propertyString = propertyString;
	}
	
	public String getPropertyString() {
		return this.propertyString;
	}
}
