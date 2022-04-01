class MyPoint extends Object{
	int x;
	int y;
}

class Circle extends MyPoint{
	int r;
} // 상속

class Circle_1 extends MyPoint{
	MyPoint p = new MyPoint();        // 참조변수의 초기화_1
	
	MyPoint p1;
	Circle_1(){ p1 = new MyPoint(); } // 참조변수의 초기화_2
	
	int r;
} // 포함

class Ex7_1_2 {
	public static void main(String args[]) {
		Circle c = new Circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		
		System.out.println("c.x="+c.x);
		System.out.println("c.y="+c.y);
		System.out.println("c.r="+c.r);
		
		Circle_1 c1 = new Circle_1();
		c1.p.x = 4;
		c1.p.y = 5;
		c1.r = 6;
		
		System.out.println("c1.p.x="+c1.p.x);
		System.out.println("c1.p.y="+c1.p.y);
		System.out.println("c1.r="+c1.r);
		
		/* 객체마다 객체주소값이 다르게 출력된다. */
		/* c.toString() 과 {참조변수}가 같은 것만 알아두면 된다. */
		System.out.println(c.toString());  
		//객체의 주소값을 찍고, 문자열 반환
		System.out.println(c1); 
		//객체의 주소값을 찍고, 문자열 변환
		
		
		
		
	}
	
}