
public class Ex2_9_1 {
	public static void main(String[] args) {
		System.out.println("�Ǽ�-> "+10.0/3);
		System.out.println("����-> "+10/3);
		// ����� �� �̷��� ����ϴ� ���� ���� ����!!
		
		System.out.printf("age:%d year:%d\n",14,2017);
		
		double f = 123.4567890f; //double�� float ����!!
		System.out.printf("�Ҽ����Ʒ� 6�ڸ� -> %f\n",f);
		System.out.printf("�������� -> %e\n",f);
		
		System.out.printf("������ ���� -> %g\n",123.456789);
		System.out.printf("������ ���� -> %g\n",0.00000000001);
		
		System.out.printf("%s\n", Integer.toBinaryString(15));
		// 10������ 2������ �ٲٴ�  {�޼ҵ� = toBinaryString}
		
		System.out.printf("[%5d]\n", 10);  // 5�ڸ�-���� ����
		System.out.printf("[%-5d]\n", 10); // ���� ����
		System.out.printf("[%05d]\n", 10); // �տ� ��� 0 ���
		
		System.out.printf("[%5d]\n",1234567); 
		// ������ ���� �����ϸ� �׳� ������� �̾���!!
		
	}

}
