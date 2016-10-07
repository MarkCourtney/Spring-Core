package AppContext.Scope;

public class BeanAnnotations {

	private String aProp;
	private String propTwo;
	
	BeanAnnotations() {
		System.out.println("BeanAnnotations: DEFAULT ACCESS");
	}
	
	public void addAProp(String aProp) {
		this.aProp = aProp;
		System.out.println(aProp);
	}
	
	public void setPropTwo(String propTwo) {
		this.propTwo = propTwo;
		System.out.println(propTwo);
	}
	
	public void init() {
		System.out.println("BeanAnnotations: INIT");
	}
	
	public void destroy() {
		System.out.println("BeanAnnotations: DESTROY");
	}
}