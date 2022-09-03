package functionalinterface.jdk8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {

		BinaryOperator<Integer> func = (x1, x2) -> x1 + x2;
		int p = func.apply(23, 78);
		System.out.println(p);

		// Bifunction Interface:
		BiFunction<Integer, Integer, Integer> func1 = (x1, x2) -> x1 + x2;
		int result = func1.apply(40, 30);
		System.out.println(result);
	}

}
