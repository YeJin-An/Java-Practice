class Ex5_2 {
	public static void main(String[] args) {
		int   sum = 0;      // ������ �����ϱ� ���� ����
		float average = 0f; // ����� �����ϱ� ���� ����

		int[] score = {100, 88, 100, 100, 90};

		for (int i=0; i < score.length ; i++ ) {
			sum += score[i];
		}
		average = sum / (float)score.length ; 
		// �������  {�Ǽ���}���� �������� �غ��!!!

		System.out.println("total = " + sum);
		System.out.println("average = " + average);
	}
}

		/* �䷸�� �ϰ� ���� for�� ���� �󸶳� ���ұ�??
		  sum += score[0];
		  sum += score[1];
		  sum += score[2];
		  sum += score[3];
		  sum += score[4];
		*/
 