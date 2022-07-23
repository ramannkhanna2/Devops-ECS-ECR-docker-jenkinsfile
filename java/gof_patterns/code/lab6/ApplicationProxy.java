package lab6;

public class ApplicationProxy implements IApplication {

	private IApplication target;

	public ApplicationProxy(IApplication application) {
		this.target = application;
	}

	@Override
	public void doSomething() {

		System.out.println("Do the proxy work");
		target.doSomething();
	}
}
