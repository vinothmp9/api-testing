package rest_assured_serialization_pojo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization1 {

	@Test
	public void serial() throws JsonProcessingException {
		List<String> skills = new ArrayList<String>();
		skills.add("Automation Testing");
		skills.add("Api Testing");
		skills.add("mobile Testing");

		PayLoad1 payload = new PayLoad1("Arun", "kumar", 26, "QA", skills);

		ObjectMapper objmap = new ObjectMapper();
		String json = objmap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
		System.out.println(json);
	}
}
