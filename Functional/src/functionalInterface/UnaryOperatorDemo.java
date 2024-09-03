package functionalInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
//	  UnaryOperator<T> // input what output like that
		UnaryOperator<String> toUppercase = text -> text.toUpperCase();
		String changed = toUppercase.apply("plong rotha");
		System.out.println(changed);
		UnaryOperator<Integer> power = n -> (n * n);
		System.out.println(power.apply(9));

		Function<String, Integer> tolength = t -> t.length();
		Function<Integer, Integer> myPow = n -> n * n;

		int out = tolength.andThen(myPow).apply("Rotha");

		System.out.println(out);
	}
}
