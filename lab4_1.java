import java.util.Scanner;

class Song
{
	public String title;
	public String singer;
	public int price;
	public void play() {System.out.println("�뷡 ���� : "+title+" by "+singer);}
	public void price() {System.out.println(price+" ���Դϴ�.");}
}


public class lab4_1 {

	public static void main(String[] args) {
		Song s1=new Song();
		Song s2=new Song();
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("*Song 1*");
		System.out.print("����Է�:");
		s1.title=keyboard.nextLine();// s1�� title �Է¹ޱ�
		System.out.print("�������Է�:");
		s1.singer=keyboard.nextLine(); //s1�� singer�Է¹ޱ�
		System.out.print("�����Է�:");
		s1.price=keyboard.nextInt(); //s1�� price�Է¹ޱ�
		System.out.println("");
		keyboard.nextLine();
		
		System.out.println("*Song 2*");
		System.out.print("����Է�:");
		s2.title=keyboard.nextLine();// s2�� title �Է¹ޱ�
		System.out.print("�������Է�:");
		s2.singer=keyboard.nextLine();//s2�� singer�Է¹ޱ�
		System.out.print("�����Է�:");
		s2.price=keyboard.nextInt();//s2�� price�Է¹ޱ�
		System.out.println("");
		
		System.out.println("�뷡�� ������");
		System.out.println("1:"+s1.title+" 2:"+s2.title);
		int a=keyboard.nextInt();
		if(a==1)
		{
			s1.play();
			s1.price();
			System.out.println("�����մϴ�.");
		}
		else
		{
			s2.play();
			s2.price();
			System.out.println("�����մϴ�.");
		}

	}

}
