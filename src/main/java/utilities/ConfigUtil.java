package utilities;

import utilities.readers.PropertiesReader;

public class ConfigUtil {

    public static String browser;
    public static String headless;
    public static String seleniumGrid;
    public static String hubURL;
    public static String environment;
    public static String webTestURL;
    //=======================Endpoints======================
    public static void loadTestConfigurations() {
        PropertiesReader reader = new PropertiesReader( "config.properties");
        browser = reader.getPropertyUsingKey("browser");
        headless = reader.getPropertyUsingKey("headless");
        seleniumGrid = reader.getPropertyUsingKey("seleniumGrid");
        hubURL = reader.getPropertyUsingKey("hubURL");
        environment = reader.getPropertyUsingKey("environment");
        webTestURL = reader.getPropertyUsingKey("webTestURL");
    }
}
