package streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Employee3 {
private String name;
private String empCode;
private String projectCode;

public Employee3(String name) {
this.projectCode = name;
}

public Employee3() {
// TODO Auto-generated constructor stub
}

public Employee3(String name, String empCode, String projectCode) {
super();
this.name = name;
this.empCode = empCode;
this.projectCode = projectCode;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getEmpCode() {
return empCode;
}

public void setEmpCode(String empCode) {
this.empCode = empCode;
}

public Optional<String> getProjectCode() {
return Optional.ofNullable(projectCode);
}

public void setProjectCode(String projectCode) {
this.projectCode = projectCode;
}

public static List<Employee3> empDetails() {
List<Employee3> emps = new ArrayList<>();
Employee3 emp3 = new Employee3("petter", "wre2313", "FARD%$%");
Employee3 emp4 = new Employee3("Sanju", "wewe", "ded*&^*6");
Employee3 emp1 = new Employee3("Sath", "ewqe23", null);
Employee3 emp2 = new Employee3("madhy", "2dqwed", null);
emps.add(emp3);
emps.add(emp4);
emps.add(emp1);
emps.add(emp2);
return emps;
}
}

public class OptionalDemo3 {

	public static void main(String[] args) {
		 List<Employee3> empLst= Employee3.empDetails();
		 for(Employee3 emp: empLst) {
			 Optional<Employee3> opEmp =Optional.ofNullable(emp);
			 emp.setProjectCode(opEmp.flatMap(e->e.getProjectCode()).orElse("bestSol"));
			 System.out.println(emp.getEmpCode() + " : " + emp.getName() + " : " + emp.getProjectCode().get());
		 }
		 }
}
