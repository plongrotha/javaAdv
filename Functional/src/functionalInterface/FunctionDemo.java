package functionalInterface;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> getlength = new Tolength();
		Integer length = getlength.apply("Rotha");
		System.out.println(length);

		// =================================

		Function<String, Integer> getlenght2 = name -> name.length();
		System.out.println(getlenght2.apply("PlongRotha"));
		System.out.println(getlenght2.apply("MynameIsRotha"));

		Function<String, Character> getchar = text -> text.charAt(0);
		System.out.println(getchar.apply("Sey"));

		Function<Integer, Integer> getpower = n -> (n * n);
		System.out.println(getpower.apply(4));
		
	}

	static class Tolength implements Function<String, Integer> {

		@Override
		public Integer apply(String t) {
			return t.length();
		}
	}

}
/*

        Function<T, R>
*/