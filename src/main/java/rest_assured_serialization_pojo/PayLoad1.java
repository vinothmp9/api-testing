package rest_assured_serialization_pojo;

import java.util.List;

public class PayLoad1 {

	private String firstname;
	private String lastname;

	private int age;
	private String profession;
	private List<String> Skills;
	
	
	public PayLoad1(String firstname,String lastname,int age,String profession,List<String> Skills) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
		this.profession=profession;
		this.Skills=Skills;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}


	public List<String> getSkills() {
		return Skills;
	}


	public void setSkills(List<String> skills) {
		this.Skills = skills;
	}
	}
