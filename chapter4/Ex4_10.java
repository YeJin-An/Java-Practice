class Ex4_10 {
	public static void main(String[] args) { 
		int sum = 0;   // 값을 저장하기 위한 변수지정

		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		
		for(int i=1; i <= 5; i++) {
			sum += i ;
			System.out.printf("1부터 %2d까지 합:{%2d}%n", i, sum);
		}
	} 
}