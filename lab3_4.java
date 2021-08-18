import java.util.Scanner;
public class lab3_4 {

	public static void main(String[] args) {
		System.out.print("Enter the height of the triangle");
		Scanner keyboard=new Scanner(System.in);
		int height=keyboard.nextInt();
		
		for (int i=0;i<height;i++)
		{
			
				for(int z=height-(i+1);z>0;z--)
				{
					System.out.print(" ");
				}
			
		
			for(int j=0;j<=2*(i);j++)
			{				
				
				System.out.print("*");
				
			}
			System.out.println("");
		}
		

}}
