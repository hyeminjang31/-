import java.util.Scanner;
public class lab_1_2 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int a,b,c;
		float everage;
		
		System.out.println("정수 세 개 입력 ");
		a=keyboard.nextInt();b=keyboard.nextInt();c=keyboard.nextInt();
		everage=(float)(a+b+c)/3;
		System.out.printf("평균 : %.2f",everage);

	}

}
