import java.util.*;
public class lab3_1 {

	public static void main(String[] args) {
		System.out.print("�� �Է�:");
		Scanner keyboard=new Scanner(System.in);
		int month=keyboard.nextInt();
		if(month<0 || month >12) 
		{
			System.out.println("�Է¿���");
			System.exit(0);
		}
		int day=0;
		switch(month) 
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: day=31;break;
		case 2: day=28; break;
		case 4:
		case 6:
		case 9:
		case 11: day=30;break;		
		}
		
		System.out.println(month+"������ "+day+"���� �ֽ��ϴ�.");
		
	}

}
