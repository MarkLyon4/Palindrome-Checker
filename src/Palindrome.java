import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter word/sentence to see if it is a palindrome.");
		Scanner sc = new Scanner(System.in); //lets user enter a string
		String phrase = sc.nextLine();
	    // Gives the new string the name "phrase"
		String phrase2 = phrase.replaceAll("\\s+", ""); //gets rid of whitespace
		String phrase3 = phrase2.replaceAll("[^\\p{Alpha}]", ""); //gets rid of things like ' and .
		String phrase4 = phrase3.toLowerCase(); //Makes all letters lower case
		is_Palindrome(phrase4);
		sc.close();
	}
	public static boolean is_Palindrome(String phrase4){
		Stack stack = new Stack();
		Queue queue = new Queue();  //Creates new stack and queue
		for (int i = 0; i<phrase4.length(); i++){
			stack.push(phrase4.charAt(i));
			queue.enqueue(phrase4.charAt(i));
			}//puts each letter into the queue and stack
		for (int i = 0; i<phrase4.length(); i++){
			Node letter1 = stack.pop();
			Node letter2 = queue.dequeue();
			if (letter1.data != letter2.data){ //takes each letter out and checks if they match
				System.out.print("Not a palindrome.");
				return false;
				}
			}
		System.out.print("Is a palindrome.");
		return true;
	}
}
