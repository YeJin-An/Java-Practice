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
		    // score[i]�� �ϴ� ������ �迭�� ���̰� �ٸ� ��츦 ����Ͽ� �Ѵ�.
			}
		}

		System.out.println("sum=" + sum);
	}
}