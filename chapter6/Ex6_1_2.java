public class Ex6_1_2 { 
	public static void main(String[] args) {
//		Love t;
//		t = new Love();
		Love t = new Love();
		
		t.channel = 7;    //변수 사용
		t.channelDown();  //메서드 사용
		System.out.println("현재 채널은 "+t.channel+" 입니다.");
		
	}// 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직
} // 소스파일의 이름은 public class이름과 일치


/*
1. 클래스(설계도) 작성
2. 객체(제품)생성
3. 객체(제품) 사용
*/

class Love{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
	
}