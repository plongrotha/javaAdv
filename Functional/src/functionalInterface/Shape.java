package functionalInterface;


@FunctionalInterface
public interface Shape {

	double getArea();

	default void show() {
		System.out.println("this is new feature");
	}
}
