package advanceTopic;

public class ProblemSolving {

	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[0] = "My Name";
		names[1] = "Your Name";
		names[2] = "someone else name";
		names[3] = "something";
		names[4] = "new";
		
		boolean isNameAvailable = false;
		
		for(int i=0; i<names.length; i++) {
			if(names[i] == "something1") {
				  isNameAvailable = true;
				  break;
			}else {
				  isNameAvailable = false;
			}
		}
		
		if(isNameAvailable) {
			System.out.println("name is there");
		}else {
			System.out.println("name is not there");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(names[0] == "something") {
//			  System.out.println("name there");
//		}else
//			  System.out.println("name not there");
//		if(names[1] == "something") {
//			  System.out.println("name there");
//		}else
//			  System.out.println("name not there");
//		if(names[2] == "something") {
//			  System.out.println("name there");
//		}else
//			  System.out.println("name not there");
//		if(names[3] == "something") {
//			  System.out.println("name there");
//		}else
//			  System.out.println("name not there");
//		if(names[4] == "something") {
//			  System.out.println("name there");
//		}else
//			  System.out.println("name not there");
//		
		
		
		
		
		
		
		
//		String name = "no name";
//		
//		if(name == "no name") {
//			System.out.println("name found");
//		}else {
//			System.out.println("name not found");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
