import java.util.Arrays;  // Arrays.toString()�� ����ϱ� ���� �߰�

class Ex5_1 {
	public static void main(String[] args) {
		
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		
		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1;
			// ���������� 1~.length���� ���� �־��??
			}

		
		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*100) + 1; 
			// 1~100�� �߿� �ϳ��� �ϳ��� ��ҿ� �־��??
			}

		
		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");	
			// �̰Ŵ�.... ���ڸ� �߰��϶�� �ϴ� �ǰ�???
		}
		System.out.println(); // ��!! �ٹٲ��� �غ��??

		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		
		// Arrays.toString �ؾߤ̤� ���� ��µǿ�̤�
		System.out.println(iArr3);
		
		// ����� toString�� ���� �ʾƵ� ��µǿ�!!
		System.out.println(chArr);
	}
}