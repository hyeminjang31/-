import java.util.Scanner;
public class lab3_3 {

	public static void main(String[] args) {
		
		System.out.println("Factorial을 계산한 정수 입력");
		Scanner keyboard=new Scanner(System.in);
		int a=keyboard.nextInt();
		int b=1;
		while(true) 
		{
			if (0<a && a<=10) break;
			else 
			{
				System.out.println("정수 재입력(1~10)");
				a=keyboard.nextInt();
			}				
		}
		b=a;
		System.out.print(a+"! = "+a);
		
		for(int i=a-1;i>0;i--) 
		{
			System.out.print(" X "+i);
			b*=i;
		}
		System.out.println(" = "+b);
		
		
		

	}

}
