package lab4;

public class SingleThreadSafeDoubleCheck {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static SingleThreadSafeDoubleCheck instance;

	private SingleThreadSafeDoubleCheck() {
		// private constructor
	}

	public static SingleThreadSafeDoubleCheck getInstance() {
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (SingleThreadSafeDoubleCheck.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new SingleThreadSafeDoubleCheck();
				}

			}
		}
		return instance;
	}
}