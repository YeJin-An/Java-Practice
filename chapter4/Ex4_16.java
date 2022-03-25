class Ex4_16 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		for(;true;) {  // while(true) //
			if(sum > 100)
				break;
			++i;
			sum += i;
		} 

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}
		/*
		  1. ++i = 0 + 1;
		       i = 1
		       
		  2. sum += i -> sum = sum + i
		                 sum  = 0  + 1
		                 sum  = 1  + 2    
		*/
 