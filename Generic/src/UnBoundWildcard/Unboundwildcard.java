package UnBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class Unboundwildcard {

	public static void printdata(List<?> list) { // print all the value it don't what is the type
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {

		List<String> strings = List.of("Rotha", "Leak", "Pin");
		printdata(strings);

		List<Integer> ints = List.of(2, 3, 4, 65, 4);
		printdata(ints);
		
		List<Character> characters = List.of('e','r','y');
		printdata(characters);

	}

}
