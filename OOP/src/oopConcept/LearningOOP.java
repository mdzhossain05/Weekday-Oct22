package oopConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class LearningOOP {

	public static void main(String[] args) throws AWTException {

//		OOP - Object Oriented Programming
//		apie
//		1. Abstraction 
//			secure the class so that no one can create an object of that class
//			100% abstraction is not possible.
//		2. Polymorphism
//			1. Compile time polymorphism - Method Over Loading
//				- happens in the same class
//			2. Run time polymorphism - Method Over Riding
//				- happens between parent and child
//		3. Inheritance
//			Parent child relationship
//				this - refer to the child 
//				super - refers to parent class 
//		4. Encapsulation
//			Hide data (variables and functions)
		
//		SampleClass sc = new SampleClass();
//		sc.printName();
//		System.out.println(sc.a);
		
		
		Animal animal = new Human();
		animal.eat();
		animal.sleep();
		
		
		Human human = new Human();
		human.talking();
//		human.a = 20;
		human.eat();
		
		
		
		Cat cat = new Cat();
		cat.scratch();
		
		
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

	}

}
