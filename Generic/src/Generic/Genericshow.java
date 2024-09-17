package Generic;

import java.util.ArrayList;
import java.util.List;

public class Genericshow {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("school");
		list.add("hello");

//		list.add(Integer.valueOf(5));
		for (String object : list) {
//			String str = (String) object;
			System.out.println(object);
		}
	}
}
