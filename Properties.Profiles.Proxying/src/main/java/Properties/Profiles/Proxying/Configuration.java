package Properties.Profiles.Proxying;

import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:/${ENV}.application.properties")
public class Configuration {

	
}
