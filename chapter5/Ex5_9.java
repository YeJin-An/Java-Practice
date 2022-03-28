class Ex5_9 {
	public static void main(String[] args) {
		 int[][] score = {
							  { 10, 10, 10}
							, { 20, 20, 20}
							, { 30, 30, 30}
							, { 40, 40, 40}
							, { 50, 50, 50}
						};
		// 과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;

	    System.out.println("번호  국어  영어  수학  총점  평균 ");
	    System.out.println("=============================");

		for(int i=0;i < score.length;i++) {
			int  sum = 0;      // 평균을 저장하기 위한 저장공간
			float avg = 0.0f;  // 값을 실수로 출력하기 위한 저장공간

			korTotal  += score[i][0];
			engTotal  += score[i][1];
			mathTotal += score[i][2];
			
			// 번호를 입력하기 위한 sop 
			System.out.printf("%3d", i+1);
			

			for(int j=0;j < score[i].length;j++) {
				sum += score[i][j]; 
				System.out.printf("%5d", score[i][j]);
			}  // 총점 출력

			avg = sum/(float)score[i].length;  // 평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}     // 평균 출력

		System.out.println("=============================");
     	System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}