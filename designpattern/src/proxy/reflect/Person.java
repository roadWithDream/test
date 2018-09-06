package proxy.reflect;

public class Person {
	private String name;

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		say();
		return name;
	}
	
	private void say(){
		System.out.println("");
	}
}
