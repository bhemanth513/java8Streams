package streamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(3,2,4,5,1,6,9,8);
		
		//sorted
		List<Integer> numList = num.stream().sorted().collect(Collectors.toList());
		System.out.println(numList);//assendeing order
		
		List<Integer> ReversenumList = num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ReversenumList); //decending order
		
		
		//anyMatch()--> anyone will satisfies the condition
		Set<String> fruits = new HashSet<String>();
		fruits.add("one apple");
		fruits.add("two apple");
		fruits.add("one mango");
		fruits.add("one mango");
		fruits.add("two guavas");
		
		boolean result = fruits.stream().anyMatch(value -> {return value.startsWith("one");});
		System.out.println(result);
		
		//allMatch()--> all should starts with given value otherwise returns false
		boolean result2 = fruits.stream().allMatch(value -> {return value.startsWith("one");});
		System.out.println(result2);
				
		//noneMatch()
		boolean result3 = fruits.stream().noneMatch(value -> {return value.startsWith("one");});
		System.out.println(result3);
		
		
		
		///findAny()--> returns a optional class
		List<String> StringList = Arrays.asList("hemanth","hema","gopi","Anji","parvathi");
		
		List<String> StringListEmpty = Arrays.asList();
		
		
		Optional<String> res = StringList.stream().findAny(); //retuns any one value
		//Optional<String> result4 = StringListEmpty.stream().findAny();//returns NoSuchElementException
		System.out.println(res.get());
		//System.out.println(result4.get());
		
		
		
		//findFirst()
		Optional<String> result5 = StringList.stream().findFirst();//returns first value
		System.out.println(result5.get());
		
		
		//concatenating two streams
		List<String> animalList = Arrays.asList("Dog","Cat","Elephant");
		List<String> birdList = Arrays.asList("peacock","parrot","crow");
		
		 Stream<String> stream1 = animalList.stream();
		 Stream<String> stream2 = birdList.stream();
		 
		 List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
		 System.out.println(finalList);
		
	}

}
