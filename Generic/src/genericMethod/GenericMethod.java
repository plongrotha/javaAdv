package genericMethod;

import java.util.ArrayList;
import java.util.List;

import genericClass.GenericType;

public class GenericMethod {

  public static <T> boolean isEqual(GenericType<T> t1, GenericType<T> t2) {
    return t1.getValue().equals(t2.getValue());
  } // this equal method is use to compare the value of two object

  public static <T> List<T> combine(List<T> list1, List<T> list2) {
    List<T> result = new ArrayList<>();
    result.addAll(list1);
    result.addAll(list2);
    return result;
  }

  public static <T> List<T> combineNumber(List<T> num1, List<T> num2) {
    List<T> result = new ArrayList<>();
    result.addAll(num1);
    result.addAll(num2);
    return result;
  }

  public static <T> List<T> combineCharacter(List<T> char1, List<T> char2) {
    List<T> result = new ArrayList<>();
    result.addAll(char1);
    result.addAll(char2);
    return result;
  }

  public static void main(String[] args) {
    /*
     * GenericType<Integer> t1 = new GenericType<>();
     * t1.setValue(3);
     * GenericType<Integer> t2 = new GenericType<>();
     * t2.setValue(3);
     * boolean testing = GenericMethod.isEqual(t1, t2);
     * System.out.println("===== " + testing + " =====");
     */

    List<String> list1 = new ArrayList<String>();
    list1.add("moot1");
    list1.add("moot2");
    list1.add("moot4");
    list1.add("moot4");

    List<String> list2 = new ArrayList<String>();
    list2.add("moot");
    list2.add("moot2");

    List<Integer> num1 = new ArrayList<>();
    num1.add(20);
    num1.add(19);
    List<Integer> num2 = new ArrayList<>();
    num2.add(20);
    num2.add(19);
    num2.add(18);
    List<Character> char1 = new ArrayList<>();
    char1.add('F');
    char1.add('M');
    char1.add('O');

    List<Character> char2 = new ArrayList<>();
    char2.add('A');
    char2.add('V');
    char2.add('B');

    List<String> result = combine(list1, list2);
    System.out.println(result); // this is to store all the lists of String
    System.out.println("----------------------------");

    List<Integer> result2 = combineNumber(num1, num2);
    System.out.println(result2); // this is to store all the lists of Integer

    System.out.println("----------------------------");
    List<Character> result3 = combineCharacter(char1, char2);
    System.out.println(result3); // this is to store all the lists of Character
  }
}


/*
 * here is the result of the program
 * 
 * [moot, moot2, moot, moot2]
 * ----------------------------
 * [20, 19, 20, 19, 18]
 * ----------------------------
 * [F, M, O, A, V, B]
 */