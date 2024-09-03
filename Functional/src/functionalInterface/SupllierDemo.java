package functionalInterface;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupllierDemo {

	public static void main(String[] args) {

		Supplier<String> str = () -> "Hello world!";
		System.out.println(str.get());
		
		

	}
}

// supplier is an interface