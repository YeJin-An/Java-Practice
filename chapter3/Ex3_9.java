class Ex3_9 {
	public static void main(String args[]) { 
		
		
		int a = 1_000_000;    // 1백만 = 10의6제곱
		int b = 2_000_000;    // 2백만 = 10의 6제곱

		/* 10의 12제곱  , int의 범위는 10의 9제곱.
		   int 범위를 넘었기 때문에 오버플로우 발생
		      변수의 타입을 일치하면 제대로 나온다.     */
		
		long c = (long)a * b;  // 2백만?
		
		System.out.println(c);
		// int 범위에서는 오버플로우 발생 
		// 변수의 타입을 바꿔주면 해결이 된다.
		
	
		
	}
}