package rest_assured_concepts;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.path.json.JsonPath;


public class SampleJSONParsing2 {

	@Test
	public  void parsing() {
		// TODO Auto-generated method stub
		JsonPath jp=new JsonPath(PayLoad.createrepo());
		int Employeesize = jp.getInt("EmployeeDetails.size");
		System.out.println(Employeesize);

		int TotalSalary = jp.getInt("dashboard.TotalSalary");
		System.out.println(TotalSalary);

		//all employees name	
		List<String> names = jp.get("EmployeeDetails.Name");
		for (String name : names) {
			System.out.println(name);
		}

		//emp name ,salary
		for (int i = 0; i < Employeesize; i++) {
			String eName = jp.get("EmployeeDetails.Name["+i+"]");
			int eSalary = jp.get("EmployeeDetails.Salary["+i+"]");
			System.out.println(eName+"----"+eSalary);
		}

		//chandru experience
		for (int i = 0; i < Employeesize; i++) {
			int eExp = jp.get("EmployeeDetails.Exp["+i+"]");
			if (jp.get("EmployeeDetails.Name["+i+"]").toString().equalsIgnoreCase("Chandru")) {
				System.out.println(eExp);
			}
		}
		
//// verify total salary matches with all employee salary
		int salary=0;
		for (int i = 0; i < Employeesize; i++) {
			int eSalary = jp.get("EmployeeDetails.Salary["+i+"]");
			salary=salary+eSalary;
		}
		System.out.println("salary----:"+salary);
		Assert.assertEquals(TotalSalary, salary);
	
	
	
	
	}


}
