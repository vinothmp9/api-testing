package rest_assured_complex_serialization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Serialization2 {

	@Test
	public void serial() throws JsonProcessingException {
		//Description
		String des="map containing country,region,currency";
		//region
		String reg="Asia";
		
		//countries
		List<Countries> l=new ArrayList<Countries>();
		Countries countries;
		
				//country
		List<String> country=new ArrayList<String>();
		country.add("India");
		country.add("Nepal");
		
				//data
		Data data;
		List<String> capital=new ArrayList<String>();
		capital.add("New Dehi");
		capital.add("Katmandu");
		
		List<Integer> mintemp=new ArrayList<Integer>();
		mintemp.add(15);
		mintemp.add(16);

		List<Integer> maxtemp=new ArrayList<Integer>();
		maxtemp.add(50);
		maxtemp.add(55);
		
		List<String> currency=new ArrayList<String>();
		currency.add("Rupee");
		currency.add("Napalee Rupee");
		
		Map<String, Object> m=new HashMap<String, Object>();
		for (int i = 0; i < country.size(); i++) {
			 data=	new Data(capital.get(i), mintemp.get(i), maxtemp.get(i), currency.get(i));		
			m.put(country.get(i), data);
		}
		
		Set<Entry<String, Object>> entrySet = m.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			countries=new Countries(entry.getKey(), (Data) entry.getValue());
			l.add(countries);
		}		
		
		PayLoad payload=new PayLoad(des, reg, l);

		ObjectMapper objmap=new ObjectMapper();
		String json = objmap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
		System.out.println(json);
	}}
