package genericlibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {
	public String getpropertydata(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(Autoconstant.propertyfilepath);
		p.load(fis);
		return p.getProperty(key);
		
		
	}

}
