import java.util.Scanner;
public class lab3_2 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String a="y";
		char grade='A';
		
		while(a.equals("y")) {
			System.out.print("���� �Է�:");
			int score=keyboard.nextInt();
			
			if(score<0 || score >100) System.out.println("������ 0~100�����Դϴ�.");
			else if(score>=90) grade='A';
			else if(score>=80 && score <90) grade='B';
			else if(score>=70 && score <80) grade='C';
			else grade='D';
			
			System.out.println("������ "+score+"�̰� grade�� "+grade+"�Դϴ�.");
			System.out.println("�ݺ��Ͻðڽ��ϱ�? (y/n)");
			a=keyboard.next();
			System.out.println("");
		}
		
		System.out.println("����");
	}

}
