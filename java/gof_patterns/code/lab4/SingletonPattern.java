package lab4;

public class SingletonPattern {
	// public instance initialized when loading the class
	private static final SingletonPattern instance = new SingletonPattern();

	private SingletonPattern() {
		// private constructor
	}

	public static SingletonPattern getInstance() {
		return instance;
	}
}