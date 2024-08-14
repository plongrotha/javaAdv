package UpperBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundwildcard {

	public static void printAnimals(List<? extends Animal> animals) {

		for (Animal animal : animals) {
			System.out.println(animal.getClass().getSimpleName());
		}
	}

// main method
	public static void main(String[] args) {

		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());

		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat());

		printAnimals(dogs);
		printAnimals(cats);
	}

}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}
