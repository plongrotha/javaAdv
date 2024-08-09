package genericClass;

public class WithoutGeneric {
  private Object value;

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public static void main(String[] args) {
    WithoutGeneric type = new WithoutGeneric();
    type.setValue("leak");
    String st = (String) type.getValue();
    System.out.println(st);

  }

}
