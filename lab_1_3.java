import java.util.Scanner;
public class lab_1_3 {

	public static void main(String[] args) {
		int f;
		float c;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("ȭ���µ� �Է�: ");
		f=keyboard.nextInt();
		c=(float)5/9*(f-32);
		System.out.println("ȭ���µ� : "+f);
		System.out.printf("�����µ�: %.1f",c);

	}

}
