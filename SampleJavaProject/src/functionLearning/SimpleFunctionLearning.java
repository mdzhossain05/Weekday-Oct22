package functionLearning;

public class SimpleFunctionLearning {

	//when you need to run any class, you need main method
	public static void main(String[] args) {
		
		//DRY - Don't Repeat Yourself
		//10, 20, 30, 40, 50, 60
		
//		int a = 10;
//		int b = 20;
//		int c = a + b;
//		System.out.println(c);
//		
//		int d = 30;
//		int e = 40;
//		int f = d + e;
//		System.out.println(f);
//		
//		int g = 50;
//		int h = 60;
//		int i = g + h;
//		System.out.println(i);
		
	//	class name					reference name = new 	class name();
		SimpleFunctionLearning simpleFunctionLearning = new SimpleFunctionLearning();
//		simpleFunctionLearning.addingTwoIntNumbers(10, 20);
//		simpleFunctionLearning.addingThreeIntNumbers(20, 50, 60);
//		simpleFunctionLearning.addingTwoIntNumbers(60, 50);
		
		SimpleFunctionLearning simpleFunctionLearning2 = new SimpleFunctionLearning();
//		simpleFunctionLearning2.addingThreeIntNumbers(10, 20, 30);
//		simpleFunctionLearning2.addingTwoDoubleNumbers(10.20, 20.20);
		
		AddingIntNumbers addingIntNumbers = new AddingIntNumbers();
		addingIntNumbers.addingFourIntNumbers(10, 20, 30, 60);
		
	}
	
	public void addingTwoIntNumbers(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public void addingThreeIntNumbers(int d, int e, int f) {
		int g = d + e + f;
		System.out.println(g);
	}
	
	public void addingTwoDoubleNumbers(double a, double b) {
		double c = a + b;
		System.out.println(c);
	}

}