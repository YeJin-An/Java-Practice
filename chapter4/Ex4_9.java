class Ex4_9 {
	public static void main(String[] args) { 
		
		/* for문에  i++는  i=i+1 이기 때문에
		               i *=3 이거 가능!!  */
		
		for(int i=20; i<=1000; i=(i*3)-(i))
			System.out.println(i); 
		    // 가로 출력이 되지 않는다?

		for(int i=1;i<=5;i++)System.out.print(i); 
			// 가로 출력!!
		
		
		int i = 1;
		for(;true;) {
			System.out.println("i="+i);
		} // 조건식을 생략하면, true로 간주되어 무한 반복문됨!!
	
//		System.out.println(i); // 이문장으로 도달할 수 없다 !!
	}
}