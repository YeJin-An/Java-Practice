// 캡슐화 -> 외부로부터 데이터를 보호하기 위해서
//        외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해

class Time {
	int hour;
	int minute;
	int second;
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		// alt + shift + A [메서드 추출]ho
		// if(isValidHour(hour)) return;
		
		this.hour = hour;
	}
	
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
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