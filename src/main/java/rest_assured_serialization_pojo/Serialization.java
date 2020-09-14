package rest_assured_serialization_pojo;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {
	
	@Test
public void serial() throws JsonProcessingException {
PayLoad payload=new PayLoad("Hello-World22","This is your first repository", "https://github.com");

ObjectMapper objmap=new ObjectMapper();
String json = objmap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
System.out.println(json);
}}
