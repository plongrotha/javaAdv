package functionalInterface;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		
	
		Predicate<String> containA = text -> text.toLowerCase().contains("A");
		boolean A = containA.test("Rotha");
		System.out.println(A);
	}
  
}
