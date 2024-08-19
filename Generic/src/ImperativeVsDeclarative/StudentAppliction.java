package ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.List;

public class StudentAppliction {

	// selection first female student to get from teacher
	// imperative and declarative

	public static List<Student> students = List.of(

			new Student(1, "Rotha", 'M', 12), new Student(2, "Leak", 'F', 10), new Student(3, "Pin", 'F', 11),
			new Student(4, "Leap", 'F', 10), new Student(5, "Ti", 'M', 23), new Student(6, "Kan", 'M', 7),
			new Student(7, "Sey", 'F', 11));

	public static void main(String[] args) {

		List<Student> list1 = getstudents(students);
		System.out.println(list1);

	}

	public static List<Student> getstudents(List<Student> students) {

		List<Student> list = new ArrayList<Student>();
		int counter = 0;
		int limit = 3;
		for (Student st : students) {
			if (st.getGender() == 'F') {
				list.add(st);
				counter++;
			}
			if (counter == limit) {
				break;
			}
		}

		return list;
	}

	public static List<Student> getstudentsDeclarative(List<Student> students) {

		return null;
	}
}
