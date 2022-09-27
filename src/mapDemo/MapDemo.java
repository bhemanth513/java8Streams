package mapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bike","taxi","sumo","XL","car","bus","train");
		List<String> vehiclaNamesUpper = new ArrayList<String>();
		
		vehiclaNamesUpper = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(vehiclaNamesUpper);
		
		//finding lengths
		vehicles.stream().map(name->name.length()).forEach(val->System.out.print(val));
		vehicles.stream().map(name->name.length()).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> multipliedList = new ArrayList<Integer>();
		multipliedList = numbers.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println(multipliedList);
	}
}
