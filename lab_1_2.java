import java.util.Scanner;
public class lab_1_2 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int a,b,c;
		float everage;
		
		System.out.println("���� �� �� �Է� ");
		a=keyboard.nextInt();b=keyboard.nextInt();c=keyboard.nextInt();
		everage=(float)(a+b+c)/3;
		System.out.printf("��� : %.2f",everage);

	}

}
