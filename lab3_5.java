public class lab3_5 {

	public static void main(String[] args) {
	
		int[][] Score = new int [][] {{90,87,85,69,71,80},{83,74,95,62},{93,66,87,88,79},{65,96,79,84,89,90}}; //������ �迭�� ����� ������ �־� �ʱ�ȭ 
		System.out.println("<�л��� ����>");
		for(int i=0;i<Score.length;i++) //��ü �迭�� ��� ��ŭ �ݺ��ϴ� �ݺ��� �����
			{System.out.print("�׷�"+(i+1)+":"); 
			for(int j=0;j<Score[i].length;j++) //�� �� i�� ���� ��ŭ �ݺ��ϴ� �ݺ��� �����
				{System.out.print("  "+Score[i][j]+"  ");} //�� �迭�� ����ִ� ���� ���
			System.out.println("");	} // ��ĭ �Ʒ��� ������
		System.out.println("");//��ĭ �Ʒ��� ������
		System.out.println("<�׷캰 ���>");
		for(int i=0;i<Score.length;i++)  //��ü �迭�� ��� ��ŭ �ݺ��ϴ� �ݺ��� �����
		{int sumi=0; //���� sumi�� ����� 0���� �ʱ�ȭ(�����̱� ����)
		for(int j=0;j<Score[i].length;j++) //�� �� i�� ���� ��ŭ �ݺ��ϴ� �ݺ��� �����
			{sumi+=Score[i][j];} //�� �� i�� ����ִ� ������ �� ���� ���ʷ� ���ؼ� sumi�� �ֱ�
		float avgi=(float)sumi/Score[i].length; //sumi�� �� �� i�� ���� ��ŭ ����� �׷��� ��� ���ϱ�(����ȯ)
		System.out.printf("�׷�"+(i+1)+":  %.2f",avgi); //����� ����� �Ҽ��� �Ʒ� ��° ¥������ ���
		System.out.println("");//��ĭ �Ʒ��� ������
		}	}

}
