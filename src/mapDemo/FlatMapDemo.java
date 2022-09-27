package mapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



class Student{
	int Id;
	String name;
	int age;
	
	public Student(int Id, String name, int age) {
		super();
		this.Id = Id;
		this.name = name;
		this.age = age;
	}
	
	
}

public class FlatMapDemo {

	public static void main(String[] args) {
		//example1
		List<Integer> numbers1 = Arrays.asList(1,2,3);

		List<Integer> numbers2 = Arrays.asList(1,2,3);

		List<Integer> numbers3 = Arrays.asList(1,2,3);

		List<Integer> numbers4 = Arrays.asList(1,2,3);
		
		List<List<Integer>> tempList = Arrays.asList(numbers1,numbers2,numbers3,numbers4);
		
		List<Integer> list = tempList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		
		System.out.println(list);
		
		//example2
		List<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(new Student(1,"a",20));
		studentList1.add(new Student(2,"b",20));
		studentList1.add(new Student(3,"c",20));
		
		List<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(new Student(1,"d",20));
		studentList2.add(new Student(2,"e",20));
		studentList2.add(new Student(3,"f",20));
		
		List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);
		
		List<String> names = studentList.stream().flatMap(s->s.stream().map(e->e.name)).collect(Collectors.toList());
		System.out.println(names);
	}

}
