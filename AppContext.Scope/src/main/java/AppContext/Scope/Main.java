package AppContext.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	runXmlApplicationConfig();
    	runJavaApplicationConfig();
    }
    
    private static void runXmlApplicationConfig() {

    	//classpath:/ not required if file in default location
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/context.xml");
    	HelloWorldXml helloWorldWithoutParam = (HelloWorldXml) context.getBean("helloWorldXmlWithoutParam");
    	HelloWorldXml helloWorldWithParam = context.getBean("helloWorldXmlWithParam", HelloWorldXml.class);
    	
    	// Not work since two beans with same type (must identify which to use)
//    	HelloWorldXml helloWorld3 = context.getBean(HelloWorldXml.class);

    	System.out.println(helloWorldWithoutParam);
    	System.out.println(helloWorldWithParam);
//    	System.out.println(helloWorld3);
    }
    
    private static void runJavaApplicationConfig() {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

    	HelloWorldJavaConfig helloWorldJavaConfig = (HelloWorldJavaConfig) context.getBean("helloWorldJavaConfig");
    	System.out.println(helloWorldJavaConfig.getPropertyString());
    }
}
