public class Ex6_1_2 { 
	public static void main(String[] args) {
//		Love t;
//		t = new Love();
		Love t = new Love();
		
		t.channel = 7;    //���� ���
		t.channelDown();  //�޼��� ���
		System.out.println("���� ä���� "+t.channel+" �Դϴ�.");
		
	}// �ϳ��� �ҽ����Ͽ��� �ϳ��� Ŭ������ �ۼ��ϴ� ���� �ٶ���
} // �ҽ������� �̸��� public class�̸��� ��ġ


/*
1. Ŭ����(���赵) �ۼ�
2. ��ü(��ǰ)����
3. ��ü(��ǰ) ���
*/

class Love{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
	
}