package org.example.httpServer.config;

public class ConfigurationManager {

    private static ConfigurationManager myConfigurationManager; //Shared across the application
    private static Configuration myCurrentConfiguration;

    private ConfigurationManager(){
    }

    public static ConfigurationManager getInstance() {
        if (myConfigurationManager == null)
            myConfigurationManager = new ConfigurationManager();
        return myConfigurationManager;
    }

    //Used to load a configuration file by the path provided
    public void loadConfigurationFile(String filePath){

    }

    /**
     * Returns the current loaded Configuration
     * */
    public void getCurrentConfiguration(){

    }

}
