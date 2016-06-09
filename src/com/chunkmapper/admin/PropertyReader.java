package com.chunkmapper.admin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Generic utility class for reading in property file config values.
 *
 * Class looks for file named config.properties in the classpath and returns values based on passed in keys.
 * You could cache these results, but since this is minimal load and generally only happens at startup,
 * I'm not bothering with that for now.
 * @author crashbox27
 */
public class PropertyReader {

        String returnValue = "";
        InputStream inputStream;

        public String getPropertyValue(String key) throws IOException {

                try {
                        // Instantiate a property instance and load it from disk.
                        Properties prop = new Properties();
                        String propFileName = "config.properties";
                        inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
                        if (inputStream != null)  {
                                prop.load(inputStream);
                        }
                        else {
                                throw new FileNotFoundException("property file '" + propFileName + "' not found in classpath.");
                        }

                        // Get the property value and return it.
                        String returnValue = prop.getProperty(key);

                        // Log the result.
                        System.out.println("Config property '" + key + "' with value '" + returnValue + "' loaded.");
                }
                catch (Exception e){
                        System.out.println("Exception: " + e);
                }
                finally {
                        // Make sure we clean up after ourselves...
                        inputStream.close();
                }

                // Pass back the result.
                return returnValue;
        }
}