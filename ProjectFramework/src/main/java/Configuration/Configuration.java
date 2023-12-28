package Configuration;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;

@LoadPolicy(LoadType.MERGE) //look for all the below sources for the key
@Config.Sources({ //properties file names
	"system:properties",
	"classpath:config.properties",
	"classpath:English.properties",
	"classpath:French.properties"
})
public interface Configuration extends Config{

@Key("url") //property name
String getURL();

@Key("timeout")
int timeOut();

@Key("username")
String getUserName();
		
}
