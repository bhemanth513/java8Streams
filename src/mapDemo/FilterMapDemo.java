package mapDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String empName;
	int salary;
	
	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	
}

public class FilterMapDemo {

	public static void main(String[] args) {
		List<Employee> empList  = Arrays.asList(new Employee(1,"hemanth",25000),
				new Employee(1,"gopi",25000),
				new Employee(1,"basha",20000),
				new Employee(1,"baji",15000),
				new Employee(1,"suresh",35000));
		
		List<Integer> salList = empList.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
		System.out.println(salList);
	}

}
