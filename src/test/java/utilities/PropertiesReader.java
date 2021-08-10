package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesReader {
	static FileInputStream oFile;
	
	public static String getPropertyValue(String sFileName,String sKey) throws Exception{
	String sFile="./data/"+sFileName+".properties";
	String sValue=null;
	try {
		oFile=new FileInputStream(sFile);
		Properties oProp=new Properties();
		oProp.load(oFile);
		sValue=oProp.getProperty(sKey);
		return sValue;
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return sValue;

}
}