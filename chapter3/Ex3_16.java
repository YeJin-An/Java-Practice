class Ex3_16 {
	public static void main(String[] args) { 
		boolean b = true; 
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();
		// 논리 부정 연산자의 예시 입니다.

		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
	  	System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<= ch && ch<='z'));
	    System.out.printf("  'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch<='z');
	    /* 논리 부정 연산자를 사용하면 가독성이 높아지는 효과를 불러올 수 있습니다. */
	    
	
	} 
}