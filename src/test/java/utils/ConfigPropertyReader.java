package utils;

import java.io.FileReader;
import java.util.Properties;

public class ConfigPropertyReader {

	public static String getConfig(String configPropertyName) {

		try {
			FileReader reader = new FileReader(
					System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
			Properties p = new Properties();
			p.load(reader);
			return p.getProperty(configPropertyName).trim();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
