package LowerBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundwildcard {

	public static void addInteger(List<? super Integer> numbers) {
		numbers.add(11);
		numbers.add(98);
	}

	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		list.add(2);
		list.add(8);
	    System.out.println(list); 

	}
}
