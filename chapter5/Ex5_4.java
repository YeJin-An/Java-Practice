import java.util.Arrays;

class Ex5_4 {
	public static void main(String[] args) {
		
		
		int[] numArr = {0,1,2,3,4,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));

	// 배열을 shuffle를 할 건데, random 랑 swap를 사용해서 ^U^c 
		
		for(int i=0; i<numArr.length; i++) {
			int n = (int)(Math.random()*10+1);
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
			
		} 
	      /* 답지도 안보고 직점 작성했고, 로직도 이해했지요!! */	

		System.out.println(Arrays.toString(numArr));
	} // main의 끝
}