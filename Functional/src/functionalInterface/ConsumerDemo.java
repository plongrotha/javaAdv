package functionalInterface;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
//		String name;
//		Scanner scanner = new Scanner(System.in);
//
//		Consumer<String> print = text -> System.out.print(text);
//		print.accept("Enter name = ");
//		name = scanner.nextLine();
//		
//		print.accept(name);

		List<Integer> list = List.of(23, 45, 21, 10, 66, 54, 56);
		List<String> str = List.of("Rotha", "Pin", "Beca", "vathana");
		List<String> car = List.of("GTR", "lambo", "Roll Roys", "honda", "yamaha");

		Consumer<String> display1 = found -> {
			System.out.println(found);
			if (found == "Beca") {
				System.out.println(found + " is have in list");
			}
		};
		str.forEach(display1);

		// at this point is very important to learn about spring framework
		Consumer<String> cars = vehicles -> {
			System.out.println(vehicles);
			if (vehicles == "honda") {
				System.out.println(vehicles + " this type of vehicle is most use in Cambodia");
			}
		};
		car.forEach(cars);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			if (list.get(i) % 2 == 0) {
//				System.out.println(list.get(i) + " is even number");
//			}
//		}

//		
//		Consumer<Integer> display = num -> {
//			System.out.println(num);
//			if(num%2 == 0) {
//				System.out.println(num + " is even num");
//			}
//		};
//		list.forEach(display);
	}
}
