package functionalInterface;

import java.util.function.Function;

public class FunctionInterfaceDemo {

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

		Function<Integer, Integer> getpower = n -> (n * n) / 2;
		System.out.println(getpower.apply(9));
	}

	static class Tolength implements Function<String, Integer> {

		@Override
		public Integer apply(String t) {
			return t.length();
		}
	}

}
