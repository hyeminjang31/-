import java.util.*;

class Circle{
	Scanner keyboard=new Scanner(System.in);
	final double PI=3.14159;
	private double radius;
	public void SetRadius(double a) {radius=a;}
	public double getRadius() {System.out.print("반지름 입력: "); double radius=keyboard.nextDouble(); return radius;}
	public double area(double radius) {double area=PI*radius*radius; return area;}
	public void showCircle() {
		System.out.println("반지름: "+radius);
		
		System.out.println("원의 면접: "+this.area(radius));
		
	}

}

public class lab4_2 {

	public static void main(String[] args) {
		Circle c=new Circle();
		double a=c.getRadius();
		c.SetRadius(a);
		c.showCircle();

	}

}
