// ĸ��ȭ -> �ܺηκ��� �����͸� ��ȣ�ϱ� ���ؼ�
//        �ܺο��� ���ʿ���, ���������θ� ���Ǵ�, �κ��� ���߱� ����

class Time {
	int hour;
	int minute;
	int second;
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		// alt + shift + A [�޼��� ����]ho
		// if(isValidHour(hour)) return;
		
		this.hour = hour;
	}
	
	// �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
	private boolean isValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {return hour;}
}



class Ex7_1_3 {
	public static void main(String args[]) {
	
		Time t = new Time();
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(10);
		System.out.println(t.getHour());
		
		t.hour = 34;
		System.out.println(t.hour);
		
	}
	
}