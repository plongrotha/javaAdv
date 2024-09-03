package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
//		BinaryOperator<T>

		BiFunction<String, Integer, Integer> strToNum = (text, power) -> (int) Math.pow(text.length(), power);
	    
		int p = strToNum.apply("Rotha", 2);
		System.out.println(p);
				
	
	}
}
