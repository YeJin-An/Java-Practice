class Ex3_14_1 {
	public static void main(String[] args) {
		
		
		// ���ڿ� ��
		
		// ���ڿ� ����� ���_1
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		// ���ڿ� ����� ���_2
		String str_1 = new String("abc");
		String str_2 = new String("abc");
		System.out.println(str_1 == str_2);
		System.out.println(str_1.equals(str_2));
		
		
		
	}
}