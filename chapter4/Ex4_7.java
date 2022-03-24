class Ex4_7 {
	public static void main(String args[]) {
			
			
		int number = 0;
		
		// 1~10사이의 난수를 5번 출력하시오.
		for(int i=0; i<=4; i++) {
			number = (int)(Math.random()*10)+1;
			System.out.printf(i+"번 = "+number+"\n");
		}
					
	}
}
