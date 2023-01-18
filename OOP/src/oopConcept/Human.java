package oopConcept;

public class Human extends Animal{
	int b = 10;
	public Human() {
		
	}
	
	public Human(int a) {
		b = a;
	}
	
	int a = 10;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void coding() {
		System.out.println("We can code");
	}
	
	public void talking() {
		System.out.println("talk too much");
	}
	
	public void talking(String kind) {
		System.out.println("talk too much "+kind);
	}
	
	public void talking(String d, String a) {
		System.out.println("talk too much "+d);
	}
	
	public void talking(int howMany) {
		System.out.println("talk too much "+howMany);
	}
	
	public void invent() {
		System.out.println("Invent a lot of things");
	}
	
	private void walk() {
		System.out.println("walk less drive more");
	}
	
	public void eat() {
		System.out.println("eat biryani");
		System.out.println(this.a);
	}

}
