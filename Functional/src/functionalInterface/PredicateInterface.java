package functionalInterface;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {

		// Predicate<String> containA = text -> text.contains("A");
		// Predicate<String> containIgnore = text -> text.toUpperCase().contains("A");
		// boolean A = containIgnore.test("Rotha");
		// System.out.println(A);

		Predicate<Integer> greaterthan = num -> num > 10;

		// boolean test1 = greaterthan.test(20);
		// boolean test2 = greaterthan.test(2);

		// System.out.println(test1);
		// System.out.println(test2);

		Predicate<Integer> isEven = number -> number % 2 == 0;
		Predicate<Integer> isgreaterthenTen = isEven.and(greaterthan);
		System.out.println(isgreaterthenTen.test(12));

		Predicate<String> testString = Predicate.isEqual("Rotha");
		boolean r = testString.test("Rotha");
		System.out.println(r);

	}

}
// use to like compare it true or not
