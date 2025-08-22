/*
 * this class takes an input from the user before returning whether the letter "a" is located within the response
 */
import java.util.Scanner; 

class HasLetterA { 
	public HasLetterA() { 
		Scanner userInput = new Scanner(System.in); //the scanner object used to get the user's input
		System.out.print("Hello, this program will take in your input, then tell you whether the phrase you put in contains the letter \"a\" in it.\nEnter Phrase: ");
		String message = userInput.nextLine();
		for (int i = 0; i < message.length(); i++) { //traversing the input and checkign whether it contains the letter "a"
			String character = message.substring(i, i + 1);
			if (character.equalsIgnoreCase("a") == true) {
				System.out.println("\nThis phrase contains the letter a!"); //the response if "a" is found
				return;
			}
		}
		System.out.println("This phrase does not contain the letter a!"); //the response if "a" is not found
	}
	

	public static void main(String[] args) { //running the class
		new HasLetterA();
	}
}
