import java.util.Scanner;

class Ex4_5 {
	public static void main(String[] args) { 
		// �ۼ��� �ڵ��� ���� �ٿ����ҽ��ϴ�!!
		
		int  score = 0;
		char grade = 'C', opt = '-';

		System.out.print("������ �Է����ּ���.>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ������ score�� ����

		System.out.printf("����� ������ %d�Դϴ�.%n", score);

		if (score >= 90) {           // score�� 90�� ���� ���ų� ũ�� A����(grade)
			grade = 'A';
			if (score >= 98) {        // 90�� �̻� �߿����� 98�� �̻��� A+
				opt = '+';	
			} 
		} else if (score >= 80){     // score�� 80�� ���� ���ų� ũ�� B����(grade)
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} 
		} 
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
	}
}