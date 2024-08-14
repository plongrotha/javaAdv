package genericWildcard;

import java.util.List;

public class GenericWildcard {

	public static void display(List<?> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public List<?> getlist() {
		return null;
	}

	public static void main(String[] args) {
		List<String> list = List.of("Rotha", "Leak");
		display(list);
	}

}
/*
 * GenericWildCard can -parameter - field - local variable - return type
 * 
 * 
 * 
 * Can not - invoking a generic method - instancing a generic class
 */