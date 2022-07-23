package lab4;

public class SingleTonLazyInit {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static SingleTonLazyInit instance;

	private SingleTonLazyInit() {
		// private constructor
	}

	// method to return instance of class
	public static SingleTonLazyInit getInstance() {
		if (instance == null) {
			// if instance is null, initialize
			instance = new SingleTonLazyInit();
		}
		return instance;
	}
}