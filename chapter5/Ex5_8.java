class Ex5_8 {
	public static void main(String[] args) {
		int[][] score = {
				  { 10, 10, 10 }
				, { 20, 20, 20 }
				, { 30, 30, 30 }
				, { 40, 40, 40 }
		};
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);

				sum += score[i][j];
			/* sum = 0 + score[0][0]
			   sum = score[0][0] + score[0][1]  */
		    // score[i]를 하는 이유는 배열의 길이가 다를 경우를 대비하여 한다.
			}
		}

		System.out.println("sum=" + sum);
	}
}