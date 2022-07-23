package lab6;

public class ApplicationFactory {
	public static IApplication createApplication() {
		return new ApplicationProxy(new ApplicationImpl());
	}
}

