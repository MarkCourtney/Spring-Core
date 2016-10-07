package AppContext.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BeanAnnotationConfig {

	@Bean(name="annote", initMethod="init", destroyMethod="destroy")
	public BeanAnnotations beanAnnotations() {
		BeanAnnotations ba = new BeanAnnotations();
		ba.addAProp("BeanAnnotations: addProp");
		return ba;
	}
	
	@Bean(initMethod="init", destroyMethod="destroy")
	@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public BeanAnnotations prototypeBeanAnnotation() {
		BeanAnnotations ba = new BeanAnnotations();
		ba.addAProp("BeanAnnotations: addProp");
		return ba;
	}
}
