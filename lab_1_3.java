import java.util.Scanner;
public class lab_1_3 {

	public static void main(String[] args) {
		int f;
		float c;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("È­¾¾¿Âµµ ÀÔ·Â: ");
		f=keyboard.nextInt();
		c=(float)5/9*(f-32);
		System.out.println("È­¾¾¿Âµµ : "+f);
		System.out.printf("¼·¾¾¿Âµµ: %.1f",c);

	}

}
