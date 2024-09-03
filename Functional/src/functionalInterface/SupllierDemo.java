package functionalInterface;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupllierDemo {

	public static void main(String[] args) {

		/*
		 * Supplier<String> str = () -> "Hello world!"; System.out.println(str.get());
		 * 
		 */

		List<Integer> list = List.of(11, 43, 31, 43, 52, 75, 77);
		Optional<Integer> firstEven = list.stream().filter(n -> n % 2 == 0).findFirst();
		System.out.println(firstEven);
		if (firstEven.isPresent()) {
			System.out.println(firstEven.get() + 10);
		}

		List<String> names = List.of("man", "girl", "dog", "cat", "you");
		names.stream().forEach(name -> System.out.println(name));
		
		names.stream().map(s -> s.toUpperCase()).forEach(name -> System.out.println(name));
		names.stream().map(s -> s.length()).forEach(name -> System.out.println(name));

	}
}

// supplier is an interface

// when error we can think to optional we must do condition to stop it