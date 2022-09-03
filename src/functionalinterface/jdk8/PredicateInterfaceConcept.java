package functionalinterface.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> func = x -> x>5;
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> colList = list.stream().filter(func).collect(Collectors.toList());
		System.out.println(colList);
		
		//predicate with &&
		List<Integer> colList1 = list.stream().filter(x -> x>5 && x<9).collect(Collectors.toList());
		System.out.println(colList1);
		
		//predicate with negate();
		List<String> namesList = Arrays.asList("Sokoeurn", "Kosal", "Sokoeur", "Sokoeu");
		Predicate<String> namesExp = x -> x.startsWith("Sokoeur");
		
		List<String> newNameList = namesList.stream().filter(namesExp.negate()).collect(Collectors.toList());
		System.out.println(newNameList);
		
	}

}
