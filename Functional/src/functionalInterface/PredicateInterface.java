package functionalInterface;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		
	
		Predicate<String> containA = text -> text.contains("A");
		Predicate<String> containIgnore = text -> text.toUpperCase().contains("A");
		boolean A = containIgnore.test("Rotha");
		System.out.println(A);
	}
	
  
}
// use to like compare it true or not
