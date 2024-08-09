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
    GenericType<String> type = new GenericType<String>();
    type.setValue("Coconut");

    String st = type.getValue();
    System.out.println(st);
  }

}
