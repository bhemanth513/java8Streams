package streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Roger",0,40000);
    	Employee e2 = new Employee(104,"Chris",0,45000);
    	Employee e3 = new Employee(103,"Samuel",0,50000);
    	Employee e4 = new Employee(102,"Brian",0,100000);
    	List<Employee> empList = new ArrayList<>(); 
    	empList.add(e1);
    	empList.add(e2);
    	empList.add(e3);
    	empList.add(e4);
    	
    	System.out.println("Employees less than a year old with increment:");
    	List<Employee> listNewEmp = empList.stream()
    	.filter(e->e.getYearsInOrg()<1)
    	.map(t1-> {t1.setSalary(t1.getSalary()+5000); return t1;})
    	.collect(Collectors.toList());
    	
    	listNewEmp.forEach(emp -> System.out.println(emp.getId() + ":" + emp.getName() + ":" + emp.getSalary()));
    	
    	
    	 Optional<Double> max = listNewEmp.stream()
    			 .map(emp->emp.getSalary())
    			 .reduce(Double::max); // Finding the maximum salalry
    	
    	// Finding employees with the maximum salary
    	List<Employee> listMaxEmp = listNewEmp.stream()
    				.filter(emp->emp.getSalary()==max.get())
    				.collect(Collectors.toList());
    	
    	System.out.println("\nEmployees having maximum salary after increment:");
        listMaxEmp.forEach(emp -> System.out.println(emp.getId() + ":" + emp.getName() + ":" + emp.getSalary())); 
	
	
        //Calculate the sum of the first 50 whole numbers using iterate() and reduce() methods of Stream.\
        System.out.println();
	
         Optional<Integer> sum= Stream.iterate(1, t1->t1+1).limit(50).reduce(Integer::sum);
         System.out.println(sum.get()); 
	}

}
