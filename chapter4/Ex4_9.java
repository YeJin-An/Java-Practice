class Ex4_9 {
	public static void main(String[] args) { 
		
		/* for����  i++��  i=i+1 �̱� ������
		               i *=3 �̰� ����!!  */
		
		for(int i=20; i<=1000; i=(i*3)-(i))
			System.out.println(i); 
		    // ���� ����� ���� �ʴ´�?

		for(int i=1;i<=5;i++)System.out.print(i); 
			// ���� ���!!
		
		
		int i = 1;
		for(;true;) {
			System.out.println("i="+i);
		} // ���ǽ��� �����ϸ�, true�� ���ֵǾ� ���� �ݺ�����!!
	
//		System.out.println(i); // �̹������� ������ �� ���� !!
	}
}