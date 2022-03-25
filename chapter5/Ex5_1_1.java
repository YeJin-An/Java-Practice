import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가

class Ex5_1_1 {
	public static void main(String[] args) {
		
		int[] score;          //array 선언
		score = new int[5];   // 저장공간이 있는 배열 생성
		
		int[] score_1 = new int[5]; //배열과 선언과 생성을 동시 진행
		score_1[3] = 100;
		int value_1 = score_1[3];
		
		System.out.println(value_1);
		System.out.println(score_1);

		// score_1 배열의 요소를 출력함.
		System.out.println(score_1[0]);
		System.out.println(score_1[1]);
		System.out.println(score_1[2]);
		System.out.println(score_1[3]);
		System.out.println(score_1[4]);
		System.out.println(score_1[5]);
	}
}