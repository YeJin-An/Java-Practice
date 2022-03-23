class Ex2_7 {
	public static void main(String[] args) {
		
		// 문자는 빈문자를 허용하지 않는다.
		// 문자열은 빈문자를 허용한다.
		
		String name = "Ja" + "va";
		String str  = name + 8.0;
		System.out.println(str);
		
		String s = new String("AB");
		System.out.println(s);
		
		
		char ch1 = 'A';
		int i = 'A';
		System.out.println(ch1 + i);
		System.out.println(i + ch1);
		
	}
}