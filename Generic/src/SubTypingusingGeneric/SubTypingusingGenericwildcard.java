package SubTypingusingGeneric;

import java.util.ArrayList;
import java.util.List;

public class SubTypingusingGenericwildcard {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<? extends Integer> list2 = new ArrayList<Integer>();

		List<? extends String> list3 = new ArrayList<>();

		List<? extends Number> list = list1;
		list = list2;
//		list = list3; // this have error mismatch
	}
}
