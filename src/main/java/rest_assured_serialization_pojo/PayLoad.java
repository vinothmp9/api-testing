package rest_assured_serialization_pojo;

public class PayLoad {

	private String name;
	private String description;
	private String homepage;
	public PayLoad(String name,String desc,String home) {
		this.name=name;
		this.description=desc;
		this.homepage=home;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
}
