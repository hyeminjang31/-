public class lab3_5 {

	public static void main(String[] args) {
	
		int[][] Score = new int [][] {{90,87,85,69,71,80},{83,74,95,62},{93,66,87,88,79},{65,96,79,84,89,90}}; //이차원 배열을 만들고 값들을 넣어 초기화 
		System.out.println("<학생별 성적>");
		for(int i=0;i<Score.length;i++) //전체 배열의 행수 만큼 반복하는 반복문 만들기
			{System.out.print("그룹"+(i+1)+":"); 
			for(int j=0;j<Score[i].length;j++) //각 행 i의 열수 만큼 반복하는 반복문 만들기
				{System.out.print("  "+Score[i][j]+"  ");} //각 배열에 들어있는 값들 출력
			System.out.println("");	} // 한칸 아래로 내리기
		System.out.println("");//한칸 아래로 내리기
		System.out.println("<그룹별 평균>");
		for(int i=0;i<Score.length;i++)  //전체 배열의 행수 만큼 반복하는 반복문 만들기
		{int sumi=0; //변수 sumi를 만들고 0으로 초기화(덧셈이기 때문)
		for(int j=0;j<Score[i].length;j++) //각 행 i의 열수 만큼 반복하는 반복문 만들기
			{sumi+=Score[i][j];} //각 행 i에 들어있는 값들을 앞 부터 차례로 더해서 sumi에 넣기
		float avgi=(float)sumi/Score[i].length; //sumi를 각 행 i의 열수 만큼 나누어서 그룹의 평균 구하기(형변환)
		System.out.printf("그룹"+(i+1)+":  %.2f",avgi); //계산한 평균을 소숫점 아래 둘째 짜리까지 출력
		System.out.println("");//한칸 아래로 내리기
		}	}

}
