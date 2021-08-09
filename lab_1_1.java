import java.util.Scanner;

public class lab_1_1 {

	public static void main(String[] args) {
		int base,height;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Input base: ");
		base=keyboard.nextInt();
		System.out.print("Input height: ");
		height=keyboard.nextInt();
		double area=(double)(base*height)/2;
		System.out.print("The area : "+area);
		
		
	}

}
