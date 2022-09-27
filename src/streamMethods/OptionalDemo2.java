package streamMethods;

import java.util.Optional;

class EmployeeDetail {
	private String alternateEmail;
	public Optional<String> getAlternateEmail() {
		return Optional.ofNullable(alternateEmail);
	}
	public EmployeeDetail(String alternateEmail) {
		this.alternateEmail=alternateEmail;
	}
	public EmployeeDetail() {
	}
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail=alternateEmail;
	}
}

public class OptionalDemo2 {

	public static void main(String[] args) {
		EmployeeDetail employeeDetailOptional = new EmployeeDetail(new String("John@abc.com"));
		System.out.println(employeeDetailOptional.getAlternateEmail().isPresent());
		
		
		EmployeeDetail employee1=new EmployeeDetail();
		EmployeeDetail employee2=new EmployeeDetail();
		employee1.setAlternateEmail("John@abc.com");
		System.out.println(employee1.getAlternateEmail().orElse("def@abc.com"));
		System.out.println(employee2.getAlternateEmail().orElse("def@abc.com"));
	}

}
