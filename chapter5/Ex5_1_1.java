import java.util.Arrays;  // Arrays.toString()�� ����ϱ� ���� �߰�

class Ex5_1_1 {
	public static void main(String[] args) {
		
		int[] score;          //array ����
		score = new int[5];   // ��������� �ִ� �迭 ����
		
		int[] score_1 = new int[5]; //�迭�� ����� ������ ���� ����
		score_1[3] = 100;
		int value_1 = score_1[3];
		
		System.out.println(value_1);
		System.out.println(score_1);

		// score_1 �迭�� ��Ҹ� �����.
		System.out.println(score_1[0]);
		System.out.println(score_1[1]);
		System.out.println(score_1[2]);
		System.out.println(score_1[3]);
		System.out.println(score_1[4]);
		System.out.println(score_1[5]);
	}
}