package genericMethod;

import genericClass.GenericType;

public class GenericMethod {
  public static <T> boolean isEqual(GenericType<T> t1, GenericType<T> t2) {
    return t1.getValue().equals(t2.getValue());
  }

  public static void main(String[] args) {
    GenericType<Integer> t1 = new GenericType<>();
    t1.setValue(3);
    GenericType<Integer> t2 = new GenericType<>();
    t1.setValue(3);
    boolean testing = GenericMethod.<Integer>isEqual(t1, t2);
    System.out.println(testing);
  }
}
