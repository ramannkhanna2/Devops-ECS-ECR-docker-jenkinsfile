package lab4;

public class SingletonThreadSafe {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static SingletonThreadSafe instance;

	private SingletonThreadSafe() {
		// private constructor
	}

	// synchronized method to control simultaneous access
	synchronized public static SingletonThreadSafe getInstance() {
		if (instance == null) {
			// if instance is null, initialize
			instance = new SingletonThreadSafe();
		}
		return instance;
	}
}