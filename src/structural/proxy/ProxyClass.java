package structural.proxy;

public class ProxyClass extends RealSubjectClass {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("I am in Proxy");
		
		System.out.println("Calling Real");
		super.method();
	}

}
