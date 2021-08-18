import java.util.Scanner;
public class lab3_2 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String a="y";
		char grade='A';
		
		while(a.equals("y")) {
			System.out.print("점수 입력:");
			int score=keyboard.nextInt();
			
			if(score<0 || score >100) System.out.println("점수는 0~100사이입니다.");
			else if(score>=90) grade='A';
			else if(score>=80 && score <90) grade='B';
			else if(score>=70 && score <80) grade='C';
			else grade='D';
			
			System.out.println("점수는 "+score+"이고 grade는 "+grade+"입니다.");
			System.out.println("반복하시겠습니까? (y/n)");
			a=keyboard.next();
			System.out.println("");
		}
		
		System.out.println("종료");
	}

}
