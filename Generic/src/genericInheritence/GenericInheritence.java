package genericInheritence;

public class GenericInheritence {

  static class Rotha<T> {

  }

  static class Leak<T> extends Rotha<T> {

  }

  static class Mango<T> extends Rotha<T> {

  }

  public static void main(String[] args) {
    String st = "Book";
    Object object = new Object();
    object = st;
    System.out.println(object);

    Rotha<Object> obj = new Rotha<>();

    Leak<Object> leakG = new Leak<>();
    obj = leakG;

    Mango<Object> mango = new Mango<>();
    obj = mango;

  }

}
