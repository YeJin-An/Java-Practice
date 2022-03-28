import java.util.*;

class Ex5_11_1 {
	public static void main(String[] args) {
		
		// 배열다루기__배열의 비교와 출력
		
		String[][] str2D = new String[][] {
			{"aaa","bbb"},
			{"AAA","BBB"}
		};
		
		String[][] str2D2 = new String[][] {
			{"aaa","bbb"},
			{"AAA","BBB"}
		};
		
		// equals는 == 1차원,  deepEquals == 2차원이상 다차원 
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
	}
}