class Ex3_2 {
	public static void main(String args[]) {
		
		
		int one = 5, two = 0;
		
		two = one;
		one++;
		// two = one++;
		System.out.println("후위형 "+one+" "+two);
		
		++one;
		two = one;
		// two = ++one;
		System.out.println("전위형 "+one+" "+two);
		
		
	}
}