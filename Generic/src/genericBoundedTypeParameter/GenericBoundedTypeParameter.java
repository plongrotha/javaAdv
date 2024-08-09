package genericBoundedTypeParameter;

import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class GenericBoundedTypeParameter {

  public static <T extends Number> double sum(List<T> numbers) {
    double totle = 0;
    for (T num : numbers) {
      totle += num.doubleValue();
    }
    return totle;
  }

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
    double total = sum(numbers);
    System.out.println(total);

    List<Long> num = List.of(29l, 44l, 562l, 678l);
    double total2 = sum(num);
    System.out.println(total2);
  }
}
