class Ex2_12 {
	public static void main(String args[]) {
		String str = "3";
		// ���ڿ�3�� �ʱ�ȭ �ߴ�!!

		System.out.println(str.charAt(0) - '0');
		// ���ڿ��� ���ڷ� ��ȯ��, 
		// ���ڰ� ���ϸ� ���� , ���� ����!!
		System.out.println('3' - '0' + 1);
		// ���ڰ� ���� ����
		System.out.println(Integer.parseInt("3") + 1);
		// ���ڿ��� ���ڷ� ��ȯ
		System.out.println("3" + 1);
		// ���ڿ��� ���ڰ��� ������ ����!!
		System.out.println(3 + '0');
		System.out.println((char)(3 + '0'));
		// ���ڿ� ���ڿ��� ���ϱ� ����!!
		
		
	}
}