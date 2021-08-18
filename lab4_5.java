import java.util.*;
class MenuOrder{
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	
	public void setpice(String menu,int price) {
		if(menu.equals("coke")) cokePrice=price;
		else if(menu.equals("lemonade")) lemonadePrice=price;
		else coffeePrice=price;
	}
	public void Inputmoney(int money) {inputMoney=money;}
	
	public void showMenu() {
		System.out.println("1. Coke: "+this.cokePrice);
		System.out.println("2. Lemonade: "+this.lemonadePrice);
		System.out.println("3. Coffee: "+this.coffeePrice);
	}
	public void showResult(int c) { //showResult라는 메서드 생성 
		int change;
		if(c==1) { //int c가 1이라면 실행함
			this.drinkSelected="Coke";
			System.out.println(drinkSelected+"를 선택하셨습니다.");
			if(inputMoney>=cokePrice) { //inputMoney가 cokePrice보다 크다면 실행함
				change=inputMoney-cokePrice;
				System.out.println("잔돈은 "+change+"원입니다.");		}
			else {change=cokePrice-inputMoney;
			System.out.println(change+"원 더 넣어주세요.");}	}
		else if(c==2) { //int c가 2라면 실행함
			this.drinkSelected="Lemonade";
			System.out.println(drinkSelected+"를 선택하셨습니다.");
			if(inputMoney>=lemonadePrice) {//inputMoney가 lemonadePrice보다 크다면 실행함
				change=inputMoney-lemonadePrice;
				System.out.println("잔돈은 "+change+"원입니다.");		}
			else {change=lemonadePrice-inputMoney; //부족한 돈 계산
			System.out.println(change+"원 더 넣어주세요.");}	}
		else if(c==3) {this.drinkSelected="Coffee"; //int c가 3이라면 실행함
		System.out.println(drinkSelected+"를 선택하셨습니다.");
		if(inputMoney>=coffeePrice) { //inputMoney가 coffeePrice보다 크다면 실행함
			change=inputMoney-coffeePrice;
			System.out.println("잔돈은 "+change+"원입니다.");	}
		else {change=coffeePrice-inputMoney;
		System.out.println(change+"원 더 넣어주세요.");}	}
		else {System.out.println("없는 메뉴를 선택하셨습니다.");}}}
	
	




public class lab4_5 {

	public static void main(String[] args) {
		MenuOrder m=new MenuOrder();
		Scanner keyboard=new Scanner(System.in);
		
		
		System.out.println("--- 음료가격 설정---");
		System.out.println("Coke 가격"); m.setpice("coke", keyboard.nextInt());
		System.out.println("Lemonade 가격"); m.setpice("lemonade", keyboard.nextInt());
		System.out.println("Coffee 가격"); m.setpice("coffee", keyboard.nextInt());
		
		String input="y"; //n이 나올때까지 while문을 돌리기 위하여 String 타입의 input변수를 생성하고 y로 초기화
		while(input.equals("y")) { //input이 y이면 계속 실행
			System.out.println("");
			System.out.println("--- 돈을 넣으세요 ---");
			int inputMoney=keyboard.nextInt(); 
			m.Inputmoney(inputMoney); //inputMoney메서드를 호출하여 입력받은 수를 menu오브젝트의 inputMoney에 저장
			System.out.println("--- 음료를 선택하세요 ---");
			m.showMenu(); //showMenu메서드 호출
			int number=keyboard.nextInt();
			m.showResult(number); //showResult 메서드 호출 
			System.out.println("계속 하시겠습니까? (y/n)");
			input=keyboard.next();	}
		
	}

}
