package rest_assured_complex_serialization;

import java.util.List;

public class PayLoad {

	private String description;
	private String region;
	private List<Countries> countries;
	
	public PayLoad(String description,String region,List<Countries> countries) {
		this.description=description;
		this.region=region;
		this.countries=countries;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public List<Countries> getCountries() {
		return countries;
	}
	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}


}
