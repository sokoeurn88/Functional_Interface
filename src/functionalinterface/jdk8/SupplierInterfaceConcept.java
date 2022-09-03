package functionalinterface.jdk8;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {

		//take no argument and return a result
		
		getText(() -> "Java");
		getText(() -> "Sokoeurn");
		getText(() -> "Kosal");

	}
	
	public static void getText(Supplier<String> text) {
		System.out.println(text.get().length());
		
	}
	
	
}
