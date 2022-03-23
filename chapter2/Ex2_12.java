class Ex2_12 {
	public static void main(String args[]) {
		String str = "3";
		// 문자열3을 초기화 했다!!

		System.out.println(str.charAt(0) - '0');
		// 문자열을 문자로 변환후, 
		// 문자간 더하면 문자 , 빼면 숫자!!
		System.out.println('3' - '0' + 1);
		// 문자간 빼면 숫자
		System.out.println(Integer.parseInt("3") + 1);
		// 문자열을 숫자로 변환
		System.out.println("3" + 1);
		// 문자열과 숫자간의 합지기 실행!!
		System.out.println(3 + '0');
		System.out.println((char)(3 + '0'));
		// 숫자와 문자열의 더하기 실행!!
		
		
	}
}