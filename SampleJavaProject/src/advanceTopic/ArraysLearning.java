package advanceTopic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ArraysLearning {

	public static void main(String[] args) {
		
		int numberOne = 10;
		int numberTwo = 20;
		int numberThree = 30;
		int numberFour = 40;
		
		
		
		int numberFive; //declaration of a variable
		numberFive = 50; // Initialization of a variable
		
		
		int[] numbers = {10, 20, 30, 40, 50};
//		System.out.println(Arrays.toString(numbers));
		
		
		
		int[] numbersArr = new int[3];
		
		//0, 1, 2
		numbersArr[0] = 100;
		numbersArr[1] = 200;
		numbersArr[2] = 300;
		
//		System.out.println(numbersArr[0]);
//		System.out.println(numbersArr[1]);
//		System.out.println(numbersArr[2]);
		
		// create an int/double/string array, assign values and print them 
		
		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
		
		//create a int variable to store 3 values
		
		//create a String array variable to store 3 values
		//create a double array variable to store 3 values
		
		
		
		
		
		//create a double array variable to store 10 values
		//create a int array variable to store 10 values
		//create a string array variable to store 10 values
		
		
		
		
//		int[] numArr = new int[3];
//		
//		numArr[0] = 10;
//		numArr[1] = 20;
//		numArr[2] = 30;
//		
//		System.out.println(numArr[0]);
		
		
		String[] names = new String[5];
		
		names[0] = "My Name";
		names[1] = "Your Name";
		names[2] = "someone else name";
		names[3] = "something";
		names[4] = "new";
		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
		
		//class will start at 8:35pm

//		for(int i=0; i <names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		
		
		
		
		
//		if(names[0] == "someone else name") {
//			System.out.println("name is there");
//		}else {
//			System.out.println("name is not there");
//		}
//		
//		if(names[1] == "someone else name") {
//			System.out.println("name is there");
//		}else {
//			System.out.println("name is not there");
//		}
//		
//		if(names[2] == "someone else name") {
//			System.out.println("name is there");
//		}else {
//			System.out.println("name is not there");
//		}
		
		


		String[] names2 = new String[3];
		
		List<String> namesList = new ArrayList<String>();
		
		namesList.add("something");
		namesList.add("anything");
		namesList.add("nothing");
		namesList.add("something");
		namesList.add("anything");
		namesList.add("nothing");
		namesList.add("something");
		namesList.add("anything");
		namesList.add("nothing");
		namesList.add("something");
		namesList.add("anything");
		namesList.add("nothing");
		
		for(int k = 0; k<namesList.size(); k++) {
		System.out.println(namesList.get(k));
		}
		
//		System.out.println(namesList);
//		System.out.println(namesList.get(0));
		
		//collection framework
		List<Double> numberList = new ArrayList<Double>();
		
		
		Set<Double> numberSet = new HashSet<Double>();
		
		numberSet.add(20.30);
		numberSet.add(3.25);
		numberSet.add(3.25);
		
//		System.out.println(numberSet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
