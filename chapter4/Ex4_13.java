class Ex4_13 {
	public static void main(String[] args) {
		
		// �񺸳�ġ������ ���� ����� �ϴ� ����!!
		int pack = 0;
		int number = 0;
		
		while (number <= 100) {
			System.out.printf("+%d = %d%n", pack, number);
		
			
	     /* number = number ++pack;
		    number = 0 + 1;
			number = 1 + 2;
			number = 3 + 3;
			number = 6 + 4;          */
			number += ++pack;
		
		}
	}
}