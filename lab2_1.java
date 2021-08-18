import java.util.Scanner;
public final class lab2_1 {

	public static void main(String[] args) {
		System.out.print("Input the amount of money");
		int money;
		Scanner keyboard=new Scanner(System.in);
		money=keyboard.nextInt();
		System.out.println("The output will be");
		int s1=money/50000;
		System.out.println("50000 won: "+s1);
		int s2=(money%50000)/10000;
		System.out.println("10000 won: "+s2);
		int s3=(money%50000%10000)/5000;
		System.out.println("5000 won: "+s3);
		int s4=(money%50000%10000%5000)/1000;
		System.out.println("1000 won: "+s4);
		int s5=(money%50000%10000%5000%1000)/500;
		System.out.println("500 won: "+s5);
		int s6=(money%50000%10000%5000%1000%500)/100;
		System.out.println("100 won: "+s6);
		int s7=(money%50000%10000%5000%1000%500%100)/50;
		System.out.println("50 won: "+s7);
		int s8=(money%50000%10000%5000%1000%500%100%50)/10;
		System.out.println("10 won: "+s8);
		int s9=(money%50000%10000%5000%1000%500%100%50%10);
		System.out.println("Remainder: "+s9);
		
		
		
	}

}
