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
    type.setValue(20); // this line value is Integer can not cast to String please fix it
    String st = (String) type.getValue();
    System.out.println(st);
  }

}
