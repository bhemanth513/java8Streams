package filterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,5,6,7,7,8,9,20);
		List<Integer> evenNumList = new ArrayList<Integer>();
		
		//using streams, taking as a predicator
		evenNumList = numList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumList);
		
		//printing as a consumer
		numList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		//using print
		numList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		
		
		
		
		
		//example two

		List<String> nameList = Arrays.asList("Hemanth","gopi","parvathi","Anjaneyulu","jyo");
		List<String> sNameList = new ArrayList<String>();
		
		sNameList = nameList.stream().filter(str->str.length()>4 && str.length()<10).collect(Collectors.toList());
		System.out.println(sNameList);
		
		
		
		
		//example 3
		
		List<Product> li = new ArrayList<Product>();
		
		li.add(new Product(1,"Hp",250000));

		li.add(new Product(2,"Hp",350000));

		li.add(new Product(3,"Hp",450000));

		li.add(new Product(4,"Hp",550000));
		
		li.stream().filter(p->p.price>250000).forEach(pr->System.out.println(pr.price));
		
	}

}
