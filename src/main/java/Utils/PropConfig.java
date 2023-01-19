package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropConfig {
	static Properties prop;

	public static Properties getPropValue() throws IOException {
		File file = new File("C:\\Users\\qazis\\eclipse-workspace\\Tdit\\src\\main\\java\\Pages\\PropConfig.properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		return prop;

	}
}
