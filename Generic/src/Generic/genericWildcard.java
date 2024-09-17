
package Generic;

import java.util.ArrayList;
import java.util.List;

public class genericWildcard {

	public static void display(List<?> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static List<?> getlist(List<?> list) {

		return list;
	}

	public static void main(String[] args) {

		List<String> stringlist = List.of("rotha", "pin", "Rebeca", "norrin");
//		display(stringlist);

		List<?> list1 = new ArrayList<>();

		List<String> list2 = new ArrayList<String>();
		list2.add("man1");
		list2.add("man2");
		list2.add("man3");
		list2.add("man4");
		list2.add("man5");
		System.out.println(getlist(list2));

		GenericClass<?> class1 = new GenericClass<>();
		class1.setvalue("i love you");

	}
}
