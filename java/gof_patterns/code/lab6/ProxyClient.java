package lab6;

public class ProxyClient {

	public static void main(String[] args) {
		IApplication application = ApplicationFactory.createApplication();
		application.doSomething();
	}
}
