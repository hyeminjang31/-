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
	public void fileInfo() {System.out.println("파일제목: "+this.getTitle()); System.out.println("페이지: "+this.getPage());}
	
	
}

public class lab4_3 {

	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
		String title;
		int page;
		MyFile fOld=new MyFile();
		MyFile fNew=new MyFile();
		System.out.println("--File정보입력(제목,페이지수)--");
		fOld.setTitle(kbd.nextLine());
		fOld.setPage(kbd.nextInt());
		fOld.fileCopy(fNew);
		System.out.println("<원래 File>");
		fOld.fileInfo();
		System.out.println("<복사된 File>");
		fNew.fileInfo();

	}

}
