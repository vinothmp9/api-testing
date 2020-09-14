package rest_assured_concepts;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class SampleJSONParsing {
	@Test
	public  void parse() throws Throwable { 
		File f=new File(".\\src\\main\\java\\rest_assured_concepts\\PayLoad.json");
		FileReader reader=new FileReader(f);
		
		JSONParser jp=new JSONParser();
		Object object=jp.parse(reader);
		
		
		JSONObject jo=(JSONObject) object;
		Object object2 = jo.get("name");
		System.out.println(object2);
	}
}
