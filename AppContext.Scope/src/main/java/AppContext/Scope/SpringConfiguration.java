package AppContext.Scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanAnnotationConfig.class)
//@ImportResource(locations="classpath:/autowiring-example-context.xml")
public class SpringConfiguration {

	@Bean
	public Run run() {
		return new Run(autowiring());
	}
	
	@Bean
	public AutowiringExample autowiring() {
		return new AutowiringExample();
	}
	
	@Bean
	public HelloWorldJavaConfig helloWorldJavaConfig() {
		HelloWorldJavaConfig hw = new HelloWorldJavaConfig("String");
		hw.setPropertyString("HelloWorldJavaConfig: PropString");
		return hw;
	}
}