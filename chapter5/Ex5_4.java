import java.util.Arrays;

class Ex5_4 {
	public static void main(String[] args) {
		
		
		int[] numArr = {0,1,2,3,4,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));

	// �迭�� shuffle�� �� �ǵ�, random �� swap�� ����ؼ� ^U^c 
		
		for(int i=0; i<numArr.length; i++) {
			int n = (int)(Math.random()*10+1);
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
			
		} 
	      /* ������ �Ⱥ��� ���� �ۼ��߰�, ������ ����������!! */	

		System.out.println(Arrays.toString(numArr));
	} // main�� ��
}