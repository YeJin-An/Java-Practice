import java.util.Scanner;

class Ex4_4 {
	public static void main(String[] args) { 
		String grade  = " ";   // ������ �����ϱ� ���� ����
		int score = 0;  // �������� �ʱ�ȭ

		System.out.print("�����з���? ");
		Scanner scanner = new Scanner(System.in);
		grade = scanner.nextLine(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ����

		System.out.println(grade);
		if (grade.length()<=2) {         // score�� 90�� ���� ���ų� ũ�� A����
			 score = 0;             
		} else if (grade.length() == 4) {   // score�� 80�� ���� ���ų� ũ�� B���� 
			 score = 3; 
		} else if (grade.length() == 3) {   // score�� 70�� ���� ���ų� ũ�� C���� 
			 score = 4; 
		} else {
			score = 1;
		}
		// �տ���  �̹� ó���� ���̶��, ������ ��Ȯ�� ���� �ʾƵ� ó�� ��.
		System.out.println("������ Ƚ���� "+ score +"�� �Դϴ�.");
	}
}