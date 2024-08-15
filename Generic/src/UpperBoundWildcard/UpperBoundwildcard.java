package UpperBoundWildcard;

import java.util.List;

public class UpperBoundwildcard {

	// print get the class that extended from Animal class
	public static void printAnimals(List<? extends Animal> animals) {
		
		for (Animal animal : animals) {
			System.out.println(animal.getClass().getSimpleName());
		}
	}

	public static double sum(List<? extends Number> numbers) {
		double total = 0;
		for (Number number : numbers) {
			total += number.doubleValue();
		}
		return total;
	}

// main method
	public static void main(String[] args) {
 
		List<Long> numlist = List.of(1l, 3l, 8l);
		double total = sum(numlist);
		System.out.println(total);

		/*
		 * List<Dog> dogs = new ArrayList<>(); dogs.add(new Dog());
		 * 
		 * List<Cat> cats = new ArrayList<>(); cats.add(new Cat());
		 * 
		 * printAnimals(dogs); printAnimals(cats);
		 */
	}

}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}
