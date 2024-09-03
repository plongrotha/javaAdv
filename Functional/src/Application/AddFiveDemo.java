package Application;

import test.AddFive;
import test.addFivempl;
import test.addNumber;

public class AddFiveDemo {

	public static void main(String[] args) {

		AddFive addfive = new addFivempl();
		int result = addfive.add(21);
		System.out.println(result);

		addNumber addNumber = new addNumber() {

			@Override
			public int addnumber(int num) {
				return num + 100;
			}
		};

		int addnumber2 = addNumber.addnumber(25);
		System.out.println(addnumber2);

		System.out.println("---------------------------");
		System.out.println("use lamda expression");
		addNumber addNumberLamda = (int n) -> n + 300;
		System.out.println(addNumberLamda.addnumber(20));
	}

}
