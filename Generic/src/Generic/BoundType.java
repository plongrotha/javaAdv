package Generic;

import java.util.List;

public class BoundType {

	public static <T extends Number> double sum(List<T> numbers) {

		double total = 0;

		for (T num : numbers) {
			total += num.doubleValue();
		}
		return total;

	}

	public static void main(String[] args) {

		List<Integer> nums = List.of(54, 6, 7, 7, 32);

		List<Double> floatnum = List.of(1.9, 89.99);
		System.out.println(sum(floatnum));
		double total = sum(nums);
//		System.out.println(total);
	}
}
