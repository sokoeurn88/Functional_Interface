package functionalinterface.jdk8;

public interface Page {

	public void greet();	//only one abstract method

	public static void test() {
	};

	default void display() {
	};

}


/*	interface			signature				examples
	UnaryOperator<T>	T apply(T t)			String::toLowerCase, Math::tan
	BinaryOperator<T>	T appply(T t1, T t2)	BigInteger::add, Math::pow
	Function<T,R>		R apply(T t)			Arrays.asList, Integer::toBinaryString
	Predicate<T, U>		boolean test(T t, U u)	String::isEmpty, Character::isDigit
	Supplier<T>			T get()					LocalDataNow, Instant::now
	Consumer<T>			void accept(T t)		System.out.println, Error::printStrackTrace
	*/