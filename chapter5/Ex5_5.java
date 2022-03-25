class Ex5_5 { 
	public static void main(String[] args) { 
		
		// 인덱스의 스코프는  "0~45-1" 까지 입니다
		int[] ball = new int[45]; 

		for(int i=0; i < ball.length; i++)  
			
		// ball이란 배열의 연속적인 숫자를 입력을 해보까?
		   ball[i] = i+1; 
		
		
		int tmp = 0;   // 값을 바꿀 저장공간을 만들어보까?? 
		int j = 0;     // 임의 값을 담아놓기 위해 저장공간을 만들어보까??

 
		for(int i=0; i < 6; i++) { 
			
			// 값을 random으로 지정하고, swap를 해보자!!
			j = (int)(Math.random() * 45); 
			tmp     = ball[i]; 
			ball[i] = ball[j]; 
			ball[j] = tmp; 
		} 

		// 마지막으로  ball이란 배열을 출력해보장!!!!
		for(int i=0; i < 6; i++) 
			System.out.printf("ball[%d]=%d%n", i, ball[i]); 
	} 
}