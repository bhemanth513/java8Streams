import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

interface StaticInterface {
	static void staticMethod() {
		System.out.println("inside interface");
	}
}
class StaticInterfaceImpl implements StaticInterface {
	public void staticMethod() {
		System.out.println("inside class");
	}
}
interface Calculator {
	public double calculate(double x, double y);
}

@FunctionalInterface
interface Assign {
    double assess(int id, double percentage);   
}

@FunctionalInterface
interface Assignnn {
    double assess(int id, double percentage);
    default double computeGrade(double cost) {
    	// code for computing grade
       return 0.0;
    }    
}

@FunctionalInterface
interface Assignn {
    double assess(int id, double percentage);
    default double computeGrade(double cost) {
    	// code for computing grade
       return 0.0;
    } 
    static void display() {
    	System.out.println("Display the grade details");
    }   
}

@FunctionalInterface
interface Assign4 {
    double assess(int id, double percentage);
    default double computeGrade(double cost) {
    	// code for computing grade
       return 0.0;
    } 
    static void display() {
    	System.out.println("Display the grade details");
    }
    public String toString();
    public boolean equals(Object objj);
}

@FunctionalInterface
 interface StringFormatter {
        String format(String s1, String s2);
}

public class Assessment {

	public static void main(String[] args) {
		 Calculator add = (double x, double y) -> { return x+y; }; 
		 Calculator subtract = (x, y) -> { return x-y; };
		 Calculator multiply = (x, y) -> x*y;
		 Calculator divide = (x, y) -> x/y;
		 System.out.println(add.calculate(2, 2));
		 System.out.println(subtract.calculate(3, 3));
		 System.out.println(multiply.calculate(4, 2));
		 System.out.println(divide.calculate(2, 1));
		 
		 String arr [] = {"Test" , "Java8" , "Features"};
		 Arrays.stream(arr).filter(e->e.length()>4);
		 
		 Stream<Integer> inputs = Stream.of(8,7,10,15,20,22,30);
			System.out.println(inputs.filter((n)-> n%5 == 0).count());
			 List<Integer> list = new ArrayList<Integer>();
		        list.add(1);
		        list.add(3);
		        list.stream().filter((n) -> n > 100);
		        list.stream().forEach(System.out::println);
		        
		        LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 11);//line 1
				LocalDate date2 = LocalDate.of(2016, 11, 12);
				System.out.println(date1.compareTo(date2));
				
				
				
				LocalDate date3 = LocalDate.of(2016, 04, 01);
				LocalDate date4 = LocalDate.of(2016, 04, 30);
				long duration = ChronoUnit.DAYS.between(date1, date2);
				System.out.println(duration);
				
				LocalDate date = LocalDate.of(2016, 11, 13);
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy",Locale.UK);
				System.out.println(date.format(formatter));
				StringFormatter output;
				output= (String firstName, String lastName)->firstName.toUpperCase()+" "+lastName.toUpperCase();
		        System.out.println(output.format("Harry", "Potter"));
		 }
	
	}


