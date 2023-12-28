package Configuration;

import org.aeonbits.owner.ConfigCache;

public class ConfigurationManager {
    public static Configuration configuration() {
        return ConfigCache.getOrCreate(Configuration.class); //instantiating the interface
}
}
