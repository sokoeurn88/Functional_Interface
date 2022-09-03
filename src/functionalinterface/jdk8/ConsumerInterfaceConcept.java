package functionalinterface.jdk8;

import java.util.Arrays;
import java.util.List;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		
		//single input argument and return no result
		
//		Consumer<String> func = x -> System.out.println(x);
//		func.accept("This is sokoeurn here!");
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.forEach(x -> System.out.println(x));
		

	}

}
