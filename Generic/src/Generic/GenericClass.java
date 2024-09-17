package Generic;

public class GenericClass<T> {

	private T value;

	public T getvalue() {
		return value;
	}

	public void setvalue(T value) {
		this.value = value;
	}

	public static void main(String[] args) {
		GenericClass<String> class1 = new GenericClass<String>();
		class1.setvalue("Plong rotha is learning java");

		System.out.println(class1.getvalue());

		GenericClass<Integer> class2 = new GenericClass<Integer>();
		class2.setvalue(21);
		System.out.println(class2.getvalue());
	}
}
