package samplePackage;

public class Operations {


	public static void main(String[] args) {
		//+, -, *, /
		int numberOne = 100;
		int numberTwo = 200;
		int result = numberOne + numberTwo;
		//				100			200
		
		//System.out.println(numberOne + numberTwo);
		//					100				200
		
		// 20.50 and 19.50
		//System.out.println(result);
		
	//  Data Type	Variable		Value
		double 		numberThree = 	20.50; // Declare & Initialize a variable 
		
		double anyNumber = 0;  // Declare a variable
		anyNumber = 200.02;// Initialize a variable
		
		//System.out.println(anyNumber);
		
		double numberFour = 19.50;
		
		double result2 = numberThree + numberFour;
		//System.out.println(result2);
		
		
		// add your first name and last name, make sure you have a space 
		// between your names
		
		String firstName = "Zakir";
		String lastName = "Hossain";
		String space = " ";
		
		String fullName = firstName + space + lastName;
		
		//System.out.println(fullName);
		
		
		
		// you have to declare and initialize 3 variables
		// one for apartmentRent, second for mobileBill, 
		// third for utilityBill
		// Declare one more variable to store the result of your
		// monthly expense. then print that expense
		
		// Take 5 more extra minutes
		double apartmentRent = 1675;
		double mobileBill = 150.55;
		double utilityBill = 200.10;
		double monthlyExpense = apartmentRent + mobileBill + utilityBill;
		//System.out.println("$"+monthlyExpense);
		
		
		
		
		int someValue = 600;
		
		int finalValue = someValue + 100 + 200; 
		
//		System.out.println(finalValue);
		
		
		
		//Celsius_temparature = (farenhite_temperature - 32)*5)/9;
		
		
		
		
		
		
		
		System.out.println("Something");
		
//		try - catch
		
		int a = 100;
		int b = 0;
		int c = 0;
		
		// Exception Handling - try catch block
		try {
		c = a/b;
		}catch(Exception e) {
			System.out.println("The issue is a can not be divided by b because "+e.getMessage());
		}finally{
			System.out.println("You want to print something");
		}
		
		
		System.out.println(c);
		
		
		System.out.println("Nothing");
		
	}

}
