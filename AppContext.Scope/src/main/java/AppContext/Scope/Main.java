package AppContext.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext xml = (AbstractApplicationContext) runXmlApplicationConfig();
    	AbstractApplicationContext java = (AbstractApplicationContext) runJavaApplicationConfig();
    	
    	xml.close();
    	java.close();
    }
    
    private static ApplicationContext runXmlApplicationConfig() {

    	//classpath:/ not required if file in default location
//    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/context.xml");
    	ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/courtneym/Desktop/Git/Parent/AppContext.Scope/src/main/resources/context.xml");
    	HelloWorldXml helloWorldWithoutParam = (HelloWorldXml) context.getBean("helloWorldXmlWithoutParam");
    	HelloWorldXml helloWorldWithParam = context.getBean("helloWorldXmlWithParam", HelloWorldXml.class);
    	
    	// Not work since two beans with same type (must identify which to use)
//    	HelloWorldXml helloWorld3 = context.getBean(HelloWorldXml.class);

    	System.out.println(helloWorldWithoutParam);
    	System.out.println(helloWorldWithParam);
//    	System.out.println(helloWorld3);
    	
    	return context;
    }
    
    private static ApplicationContext runJavaApplicationConfig() {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

    	HelloWorldJavaConfig helloWorldJavaConfig = context.getBean(HelloWorldJavaConfig.class);
    	System.out.println(helloWorldJavaConfig.getPropertyString());
    	
    	BeanAnnotations ba1  = (BeanAnnotations) context.getBean("annote");
    	BeanAnnotations ba2  = (BeanAnnotations) context.getBean("prototypeBeanAnnotation");
    	
    	Run run = context.getBean(Run.class);
    	run.printTypesOfAutoWire();
    	
    	return context;
    }
}
