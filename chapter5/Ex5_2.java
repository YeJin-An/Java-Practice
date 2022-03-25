class Ex5_2 {
	public static void main(String[] args) {
		int   sum = 0;      // 총점을 저장하기 위한 변수
		float average = 0f; // 평균을 저장하기 위한 변수

		int[] score = {100, 88, 100, 100, 90};

		for (int i=0; i < score.length ; i++ ) {
			sum += score[i];
		}
		average = sum / (float)score.length ; 
		// 계산결과를  {실수형}으로 형변형을 해보까나!!!

		System.out.println("total = " + sum);
		System.out.println("average = " + average);
	}
}

		/* 요렇게 하고 난뒤 for문 쓰면 얼마나 편리할까??
		  sum += score[0];
		  sum += score[1];
		  sum += score[2];
		  sum += score[3];
		  sum += score[4];
		*/
 