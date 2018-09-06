package proxy.helloword;

public class HelloWorldImpl implements HelloWorld{

	public void sayHelloWorld(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

	public void sayHelloWorld(String s, int i) {
		// TODO Auto-generated method stub
		for(int j=0;j<i;j++){
			System.out.println(s);
		}
		
	}
}
