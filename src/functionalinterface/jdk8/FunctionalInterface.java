package functionalinterface.jdk8;

import java.util.function.Function;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		Function<String, Integer> func = x -> x.length();	
		int len = func.apply("This is Java 8 and I am learning it");
		System.out.println(len);
		
		//chaining function
		Function<Integer, Integer> func1 = x -> x*4;
		int multi= func.andThen(func1).apply("This is sokoeurn chhay");
		System.out.println(multi);

	}

}
/*


Interface Function<T,R> type of parameter:
T=type of input
R=type of the result of the function

stream api: stream>filter>sort>map>collect,
Predicate: functional interface=SAM=@FunctionlaInterface
comparator:
function:


*/