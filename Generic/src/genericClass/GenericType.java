package genericClass;

public class GenericType<T> {
  private T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public static void main(String[] args) {
    // GenericType<String> type = new GenericType<>();
    // type.setValue("Coconut");
    // String st = type.getValue();
    // System.out.println(st);

    // GenericType<Integer> type1 = new GenericType<>();
    // type1.setValue(199);
    // int number = type1.getValue();
    // System.out.println(number);
  }

}
