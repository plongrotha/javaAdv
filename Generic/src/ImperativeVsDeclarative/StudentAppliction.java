package ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentAppliction {

	// selection first female student to get from teacher
	// imperative and declarative

	public static List<Student> students = List.of(

			new Student(1, "Rotha", "M", 12), new Student(2, "Leak", "F", 10), new Student(3, "Pin", "F", 11),
			new Student(4, "Leap", "F", 10), new Student(5, "Ti", "M", 23), new Student(6, "Kan", "M", 7),
			new Student(7, "Sey", "F", 11)

	);

	public static void main(String[] args) {

		System.out.println("imperative style");
		List<Student> list1 = getstudents(students);
		for (Student st : list1) {

			System.out.println(st);
		}

		System.out.println("declarative style");
		List<Student> list2 = getstudents(students);
//		for (Student st : list2) {
//
//			System.out.println(st);
//		}

		// use above and this it the same
		list2.forEach(System.out::println);

	}

	// function imperative style
	public static List<Student> getstudents(List<Student> students) {

		List<Student> list = new ArrayList<Student>();
		int counter = 0;
		int limit = 3;
		for (Student st : students) {
			if (st.getGender() == "F") {
				list.add(st);
				counter++;
			}
			if (counter == limit) {
				break;
			}
		}

		return list;
	}

	// declarative style
	public static List<Student> getstudentsDeclarative(List<Student> students) {

		return students.stream().filter(st -> st.getGender().equals("F")).limit(3).collect(Collectors.toList());

	}

}
