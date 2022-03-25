import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가

class Ex5_1 {
	public static void main(String[] args) {
		
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		
		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1;
			// 연속적으로 1~.length까지 값을 넣어볼래??
			}

		
		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*100) + 1; 
			// 1~100개 중에 하나를 하나의 요소에 넣어보까??
			}

		
		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");	
			// 이거는.... 문자를 추가하라고 하는 건가???
		}
		System.out.println(); // 좌!! 줄바꿈을 해보까나??

		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		
		// Arrays.toString 해야ㅜㅜ 값이 출력되요ㅜㅜ
		System.out.println(iArr3);
		
		// 요것은 toString을 쓰지 않아도 출력되요!!
		System.out.println(chArr);
	}
}