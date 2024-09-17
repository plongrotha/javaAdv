package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

	public static <T> boolean isEqual(GenericClass<T> t1, GenericClass<T> t2) {

		return t1.getvalue().equals(t2.getvalue());

	}

	public static <T> List<T> combine(List<T> list1, List<T> list2) {
		List<T> result = new ArrayList<T>();
		result.addAll(list1);
		result.addAll(list2);
		return result;
	}

	public static void main(String[] args) {
		GenericClass<Integer> t1 = new GenericClass<>();
		t1.setvalue(6);

		GenericClass<Integer> t2 = new GenericClass<>();
		t2.setvalue(5);

		boolean result = GenericMethod.<Integer>isEqual(t1, t2);
		System.out.println(result);

		List<String> list1 = new ArrayList<String>();
		list1.add("rotha");
		list1.add("man");
		list1.add("Rebeca");

		List<String> list2 = new ArrayList<String>();
		list2.add("rebeca1");
		list2.add("rebeca2");
		list2.add("rebeca3");

		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(11);
		list3.add(32);
		list3.add(49);

		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(987);
		list4.add(7);
		list4.add(4);
		list4.add(87);

		List<String> results = combine(list1, list2);
//		System.out.println(results);

		List<Integer> resultnum = combine(list3, list4);
//		System.out.println(resultnum);
	}
}
