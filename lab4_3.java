import java.util.*;


class MyFile 
{
	private String title;
	private int page;
	
	public void setTitle(String a) {title=a;}
	public String getTitle() {return title;}
	public void setPage(int a) {page=a;}
	public int getPage() {return page;}
	
	public void fileCopy(MyFile fNew)
	{
		fNew.title=this.getTitle();
		fNew.page=this.getPage();
		
	}
	public void fileInfo() {System.out.println("��������: "+this.getTitle()); System.out.println("������: "+this.getPage());}
	
	
}

public class lab4_3 {

	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
		String title;
		int page;
		MyFile fOld=new MyFile();
		MyFile fNew=new MyFile();
		System.out.println("--File�����Է�(����,��������)--");
		fOld.setTitle(kbd.nextLine());
		fOld.setPage(kbd.nextInt());
		fOld.fileCopy(fNew);
		System.out.println("<���� File>");
		fOld.fileInfo();
		System.out.println("<����� File>");
		fNew.fileInfo();

	}

}
