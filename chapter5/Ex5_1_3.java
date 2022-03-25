import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가

class Ex5_1_3 {
	public static void main(String[] args) {
		
		
		// 1
		int[] score;
		score = new int[5];
		
		// 2
		int[] score_1 = new int [5];
		
		// 3_1
		int[] score_2 = new int[] {50, 60, 70, 80, 90};
		// 3_2
		int[] score_3 = {50, 60, 70, 80, 90};
		
		// error
//		int [] score;
//		score = {50, 60, 70, 80, 90};
		
		// [I@2a139a55 --> { [I = 인티져 배열 , 나머지 = 주소 }
		
	 /* 배열의 출력
		System.out.println(Arrays.toString(Score));  */
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(score_1));
		System.out.println(Arrays.toString(score_2));
		System.out.println(Arrays.toString(score_3));
		
		
	
	}
}