class Ex5_5 { 
	public static void main(String[] args) { 
		
		// �ε����� ��������  "0~45-1" ���� �Դϴ�
		int[] ball = new int[45]; 

		for(int i=0; i < ball.length; i++)  
			
		// ball�̶� �迭�� �������� ���ڸ� �Է��� �غ���?
		   ball[i] = i+1; 
		
		
		int tmp = 0;   // ���� �ٲ� ��������� ������?? 
		int j = 0;     // ���� ���� ��Ƴ��� ���� ��������� ������??

 
		for(int i=0; i < 6; i++) { 
			
			// ���� random���� �����ϰ�, swap�� �غ���!!
			j = (int)(Math.random() * 45); 
			tmp     = ball[i]; 
			ball[i] = ball[j]; 
			ball[j] = tmp; 
		} 

		// ����������  ball�̶� �迭�� ����غ���!!!!
		for(int i=0; i < 6; i++) 
			System.out.printf("ball[%d]=%d%n", i, ball[i]); 
	} 
}