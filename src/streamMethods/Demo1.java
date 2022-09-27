package streamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//non terminal or processing methods..
//filter()
//map()
//flatmap()
//distinct()
//limit()


//terminal
//collect()
//count()
//forEach()
//min()
//max()
//reduce()
//toArray()


public class Demo1 {

	public static void main(String[] args) {
		//distinct()
		String s = "4.6,6.0,5.3,5.1,4.5";
		List<String> t =Arrays.asList(s.split(","));
		String[] arr = t.toArray(new String[0]);
		List<String> vehicleList = Arrays.asList(s.split(","));
		List<String> list = vehicleList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		for(int i=0;i<list.size();i++) {
			String val = list.get(i);
			System.out.print(arr);
		}
		
			list.forEach(System.out::println); 
		List<String> distinctVehicles = vehicleList.stream()
				.distinct().collect(Collectors.toList());
		System.out.println(distinctVehicles);
		
		vehicleList.stream().distinct().forEach(value->System.out.println(value));
		
		//count()
		long count = vehicleList.stream().distinct().count();
		System.out.println(count);
		
		//limit()
		List<String> limitVehicle = vehicleList.stream()
				.limit(3).collect(Collectors.toList());
		System.out.println(limitVehicle);
		
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		long numCount = numList.stream().filter(num->num%2==0).count();	
		System.out.println(numCount);
		
		
		//min()
		Optional<Integer> minVal = numList.stream().min((val1,val2)->{
			return val1.compareTo(val2);
		});
		
		System.out.println(minVal.get());
		

		//min()
		Optional<Integer> maxVal = numList.stream().max((val1,val2)->{
			return val1.compareTo(val2);
		});
		
		System.out.println(maxVal.get());
		
		//reduce()--> this method will combine the objects into one single object..

		List<String> tempList = Arrays.asList("a","b","c","d","5","6","7");
		
		 Optional<String> reduceList = tempList.stream().reduce((value,reducedValue)->{
			return value+reducedValue;
		});
		 
		 System.out.println(reduceList.get());
	}

}
