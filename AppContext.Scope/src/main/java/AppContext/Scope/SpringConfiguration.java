package AppContext.Scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import org.springframework.core

@Configuration
public class SpringConfiguration {
	
	@Bean
	public HelloWorldJavaConfig helloWorldJavaConfig() {
		HelloWorldJavaConfig hw = new HelloWorldJavaConfig("String");
		hw.setPropertyString("PropString");
		return hw;
	}

//	@Bean
//	public HelloWorldJavaConfig helloWorld() {
//		HelloWorldJavaConfig hw = new HelloWorldJavaConfig("String");
//		hw.setPropertyString("PropString");
//		return hw;
//	}
}