import java.util.Arrays;  // Arrays.toString()�� ����ϱ� ���� �߰�

class Ex5_1_2 {
	public static void main(String[] args) {
		
		int[] score = new int[5];
		score[3] = 200;
		int tmp = score.length;
		
		System.out.println("score �迭���̴� "+tmp);
		
		for(int i =0; i<score.length; i++) {
			System.out.println(i+"��° �迭��Ҵ� = "+score[i]);
		}
		// Exception in thread == inde�������� �����!!
	}
}