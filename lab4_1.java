import java.util.Scanner;

class Song
{
	public String title;
	public String singer;
	public int price;
	public void play() {System.out.println("노래 들어요 : "+title+" by "+singer);}
	public void price() {System.out.println(price+" 원입니다.");}
}


public class lab4_1 {

	public static void main(String[] args) {
		Song s1=new Song();
		Song s2=new Song();
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("*Song 1*");
		System.out.print("곡명입력:");
		s1.title=keyboard.nextLine();// s1의 title 입력받기
		System.out.print("가수명입력:");
		s1.singer=keyboard.nextLine(); //s1의 singer입력받기
		System.out.print("가격입력:");
		s1.price=keyboard.nextInt(); //s1의 price입력받기
		System.out.println("");
		keyboard.nextLine();
		
		System.out.println("*Song 2*");
		System.out.print("곡명입력:");
		s2.title=keyboard.nextLine();// s2의 title 입력받기
		System.out.print("가수명입력:");
		s2.singer=keyboard.nextLine();//s2의 singer입력받기
		System.out.print("가격입력:");
		s2.price=keyboard.nextInt();//s2의 price입력받기
		System.out.println("");
		
		System.out.println("노래를 고르세요");
		System.out.println("1:"+s1.title+" 2:"+s2.title);
		int a=keyboard.nextInt();
		if(a==1)
		{
			s1.play();
			s1.price();
			System.out.println("감사합니다.");
		}
		else
		{
			s2.play();
			s2.price();
			System.out.println("감사합니다.");
		}

	}

}
