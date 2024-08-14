package genericClass;

import java.util.Scanner;

public class WithoutGeneric {
  private Object value;

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public static void main(String[] args) {
//    WithoutGeneric type = new WithoutGeneric();
//    type.setValue("leak");
//    String st = (String) type.getValue();
//    System.out.println(st);
	  
	   int n;
	   String st;
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter String ="); st = scan.nextLine();
	   System.out.println("Enter n ="); n = scan.nextInt();
	   for(int i=0; i<n; i++) {
		   System.out.println(st);
	   }
  }
  
  

}
