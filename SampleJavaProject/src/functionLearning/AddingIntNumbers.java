package functionLearning;

//non runnable class
public class AddingIntNumbers {
	
	static int number = 10;
	int numberTwo = 20;
	
	public void addingTwoIntNumbers(int a, int b) {
		int c = a + b + number;
		System.out.println(c);
//		System.out.println(number);
//		{
//			System.out.println(c);
//		}
		
		
	}
	
// Access modifier 		return type			function name			Parameters
	public 				int 				addingThreeIntNumbers(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public int addingFourIntNumbers(int h, int i, int j, int m) {
		int k = h + i + j + m;
		
		
		return k;
	}
	

	
	// Create a function, which will take your string name and int zip code
	// and print it in the console. 
		
	public void addingStringAndInt(String name, int zipCode) {
		String add = name + zipCode;
		System.out.println(name);
		System.out.println(zipCode);
		System.out.println(add);
	}
	
	public static void additon(int a, int b) {
		int add = a + b;
		System.out.println(add);
	}

}
