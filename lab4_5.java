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
	public void showResult(int c) { //showResult��� �޼��� ���� 
		int change;
		if(c==1) { //int c�� 1�̶�� ������
			this.drinkSelected="Coke";
			System.out.println(drinkSelected+"�� �����ϼ̽��ϴ�.");
			if(inputMoney>=cokePrice) { //inputMoney�� cokePrice���� ũ�ٸ� ������
				change=inputMoney-cokePrice;
				System.out.println("�ܵ��� "+change+"���Դϴ�.");		}
			else {change=cokePrice-inputMoney;
			System.out.println(change+"�� �� �־��ּ���.");}	}
		else if(c==2) { //int c�� 2��� ������
			this.drinkSelected="Lemonade";
			System.out.println(drinkSelected+"�� �����ϼ̽��ϴ�.");
			if(inputMoney>=lemonadePrice) {//inputMoney�� lemonadePrice���� ũ�ٸ� ������
				change=inputMoney-lemonadePrice;
				System.out.println("�ܵ��� "+change+"���Դϴ�.");		}
			else {change=lemonadePrice-inputMoney; //������ �� ���
			System.out.println(change+"�� �� �־��ּ���.");}	}
		else if(c==3) {this.drinkSelected="Coffee"; //int c�� 3�̶�� ������
		System.out.println(drinkSelected+"�� �����ϼ̽��ϴ�.");
		if(inputMoney>=coffeePrice) { //inputMoney�� coffeePrice���� ũ�ٸ� ������
			change=inputMoney-coffeePrice;
			System.out.println("�ܵ��� "+change+"���Դϴ�.");	}
		else {change=coffeePrice-inputMoney;
		System.out.println(change+"�� �� �־��ּ���.");}	}
		else {System.out.println("���� �޴��� �����ϼ̽��ϴ�.");}}}
	
	




public class lab4_5 {

	public static void main(String[] args) {
		MenuOrder m=new MenuOrder();
		Scanner keyboard=new Scanner(System.in);
		
		
		System.out.println("--- ���ᰡ�� ����---");
		System.out.println("Coke ����"); m.setpice("coke", keyboard.nextInt());
		System.out.println("Lemonade ����"); m.setpice("lemonade", keyboard.nextInt());
		System.out.println("Coffee ����"); m.setpice("coffee", keyboard.nextInt());
		
		String input="y"; //n�� ���ö����� while���� ������ ���Ͽ� String Ÿ���� input������ �����ϰ� y�� �ʱ�ȭ
		while(input.equals("y")) { //input�� y�̸� ��� ����
			System.out.println("");
			System.out.println("--- ���� �������� ---");
			int inputMoney=keyboard.nextInt(); 
			m.Inputmoney(inputMoney); //inputMoney�޼��带 ȣ���Ͽ� �Է¹��� ���� menu������Ʈ�� inputMoney�� ����
			System.out.println("--- ���Ḧ �����ϼ��� ---");
			m.showMenu(); //showMenu�޼��� ȣ��
			int number=keyboard.nextInt();
			m.showResult(number); //showResult �޼��� ȣ�� 
			System.out.println("��� �Ͻðڽ��ϱ�? (y/n)");
			input=keyboard.next();	}
		
	}

}
