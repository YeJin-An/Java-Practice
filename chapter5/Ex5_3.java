class Ex5_3 { 
	public static void main(String[] args) { 
		int[] score = { 79, 88, 91, 33, 100, 55, 95 }; 

		int max = score[0]; // 값을 넣을 저장공간 지정 
		int min = score[0]; // 값을 넣을 저장공간 지정

		// 배열의 최대값과 최소값을 찾아보까요??
		// if문을 사용하여 최대값, 최소값 일때만 저장공간에 넣어보자!!
		for(int i=1; i < score.length;i++) {
			if(score[i] > max) { 
				max = score[i]; 
			} else if(score[i] < min) { 
				min = score[i]; 
			} 
		} // end of for 

		System.out.println("최대값 :" + max);       
		System.out.println("최소값 :" + min);       
	} // end of main 
} // end of class