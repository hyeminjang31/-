import java.util.Scanner;
public class lab2_2 {

	public static void main(String[] args) {
		System.out.println("Enter a line of text. ");
		Scanner keyboard=new Scanner(System.in);
		String message=keyboard.nextLine();
		System.out.println("Your text is \""+message+"\"");
		System.out.println("Input a word to replace.");
		String oldword=keyboard.next();
		System.out.println("Input a word to insert.");
		String newword=keyboard.next();
		message.replace(oldword, newword);
		String up=message.toUpperCase();
		System.out.println("New sentence is \""+up+"\"");
		System.out.println("The length of \""+up+"\" is "+message.length()+".");

	}

}
