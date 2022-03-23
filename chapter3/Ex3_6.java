class Ex3_6 {
	public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d%n",  a, b, a + b);
		System.out.printf("%d - %d = %d%n",  a, b, a - b);
		System.out.printf("%d * %d = %d%n",  a, b, a * b);
		System.out.printf("%d / %d = %d%n",  a, b, a / b);
		System.out.printf("%d / %f = %f%n",  a, (float)b, a / b);
		
		/* 만일 정수형은 숫자를 실수형으로 변환후 값을 계산을 하면,
		   실수형으로 변환된 값을 통일 시켜야 에러가 나오지 않는다. */
	}
}