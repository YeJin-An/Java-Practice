import java.util.*;

class Ex4_14 {
	public static void main(String[] args) { 
		int num = 0; // input�� ���� ���� 
		int sum = 0; // ���� ���� ����� ���� 
		System.out.print("������ �Է�!! ");

		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine(); // ���ڿ�
		num = Integer.parseInt(tmp);     // ����
		// �Է¹��� Ÿ���� ���������� �ٲ��ִ� �޼ҵ�!!
		
		while(num!=0) {    
	
			sum += num%10;  // ���ذ� �Ǿ���.	
			System.out.printf("input= %2d , output= %d%n", sum, num);
			// ������ �ȿ� ���ڴ� ��... 4ĭ�� ������ ���İ� ����??
 
			num /= 10;      // ���ذ� �Ǿ���.   
		}
		// for(num=1234; num>0; num = num/10){
		//     System.out.println(num%10); 
		// }     // num /= 10�� �־� �ᱹ num�� 0�� �ȴ�.

		System.out.println("total = "+sum);
		
	 /*  1. num!=0 �� num�� 0�� �ƴ� ������ while�� �����Ѵ�.
		 2. sum += num%10 
		 == sum = sum + num%10 
		 // %�� ��� ������ �� �������� ����ϴ� ��� ������ �̴�.!
		    sum = 0 + 5
		    sum = 5 + 4
		    sum = 9 + 3
		    
		 3. num /= 10 == num = num / 10
		    num = 12345 / 10 == 1234
		    num = 1234  / 10 == 123
		    num = 123   / 10 == 12                */
		
		
		
		
		
		
		
	}
}