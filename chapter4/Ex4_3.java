import java.util.Scanner; // ScannerŬ������ ����ϱ� ���� �߰�

class Ex4_3 {
	public static void main(String[] args) {  
		System.out.print("�Ǽ��� �Է��غ���!! ");
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble(); // ȭ���� ���� �Է¹��� ���ڸ� input�� ����

		if(input == (int)input) {
			System.out.println("�Ǽ��� �ƴ� ����!");	
		} else { // input!=0�� ���
			System.out.println("�Ǽ�: "+input);
		}
	} // main�� ��
}