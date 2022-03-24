class Ex3_12 {
	public static void main(String args[]) { 
		
		
		int x = 10;
		int y = 8;

		System.out.printf("%d / %d = ?  -> \n", x, y); 
		System.out.printf("몫 : %d , 나머지: %d.%n", x / y, x % +y); 
		System.out.printf("몫 : %d , 나머지: %d.%n", x / y, x % -y); 
		
		System.out.printf("몫 : %d , 나머지: %d.%n", x / y, -x % +y); 
		System.out.printf("몫 : %d , 나머지: %d.%n", x / y, -x % -y); 
	}
}
