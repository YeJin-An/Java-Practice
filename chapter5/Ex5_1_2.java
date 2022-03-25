import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가

class Ex5_1_2 {
	public static void main(String[] args) {
		
		int[] score = new int[5];
		score[3] = 200;
		int tmp = score.length;
		
		System.out.println("score 배열길이는 "+tmp);
		
		for(int i =0; i<score.length; i++) {
			System.out.println(i+"번째 배열요소는 = "+score[i]);
		}
		// Exception in thread == indeㅌ범위를 벗어났다!!
	}
}