package functionLearning;

//runnable class
public class LearingVariable {

	public static void main(String[] args) {
		
		//Global variable
		int a = 10; 
		int b = 20;
		
		{
			// Local variable
			int c = 30;
			a = 50;
			System.out.println(c);
			System.out.println(a); //50
		}
		
		{
		a = 100;
		System.out.println(a);//50
		System.out.println(b);
		}
		a = 5000;
		System.out.println(a);
	}

}