import java.util.*;

class Ex4_15 {
	public static void main(String[] args) { 
		int input  = 0, answer = 0;

		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��غ�!!");
		
		// do-while���� ����ڰ� �Է� ���� ��, �ַ� ����� �ȴ�.
		do {
			input = scanner.nextInt();

			if(input > answer) {
				System.out.print("�� ū��??");	
			} else if(input < answer) {
				System.out.print("�������� ���̷�!!");			
			}
		} while(input!=answer); //�����ݷ��� ���� ����!!

		System.out.println("������ �ֱ�");
	}
}