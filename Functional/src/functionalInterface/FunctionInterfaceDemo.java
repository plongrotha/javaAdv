package functionalInterface;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		Function<String, Integer> getlength = new Tolength();
		Integer length = getlength.apply("Rotha");
		System.out.println(length);
	}

	static class Tolength implements Function<String, Integer> {

		@Override
		public Integer apply(String t) {
			return t.length();
		}

	}

}
