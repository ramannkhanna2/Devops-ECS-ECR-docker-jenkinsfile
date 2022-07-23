package lab4;

public class SingletonStatic {
	// public instance
	public static SingletonStatic instance;

	private SingletonStatic() {
		// private constructor
	}

	static {
		// static block to initialize instance
		instance = new SingletonStatic();
	}
}