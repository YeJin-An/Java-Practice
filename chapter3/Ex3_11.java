class Ex3_11 {
	public static void main(String args[]) { 
		
		
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;
		
		System.out.println("pi -> " + pi);
		System.out.println("shortPi -> "+shortPi);
		System.out.println((double)Math.round(pi*1000)/1000);
		
		// Math.round(pi * 1000)      / 1000.0
		// Math.round(3.14592 * 1000) / 1000.0
		/* Math.round(3141.592)       / 1000.0  */
		// 3142                       / 1000.0
		
		// ���⼭ ���!
		// int / int    -> int
		// int / double -> double/double -> double
		
		/* pi�� 3.141�� �ٲٷ��� ���� �ؾ��ϴ°�? [ ����ȯ�ϸ� ��. ] */
		System.out.println((int)(pi*1000)/1000.0);
		
		
	}
}