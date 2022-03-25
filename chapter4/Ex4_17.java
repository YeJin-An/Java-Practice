class Ex4_17 {
	public static void main(String[] args) {
		
		
		for(int number=0; number <= 20; number++) {
			
			if ( number % 3 == 0) continue;
	   /* 3으로 나누어 떨어지는 경우 coninue로 [없는 셈 쳐!, 출력X] */
			
			System.out.print( number+ ", " );
		}
	}
}
 
        