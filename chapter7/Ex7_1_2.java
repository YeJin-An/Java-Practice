class MyPoint extends Object{
	int x;
	int y;
}

class Circle extends MyPoint{
	int r;
} // ���

class Circle_1 extends MyPoint{
	MyPoint p = new MyPoint();        // ���������� �ʱ�ȭ_1
	
	MyPoint p1;
	Circle_1(){ p1 = new MyPoint(); } // ���������� �ʱ�ȭ_2
	
	int r;
} // ����

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
		
		/* ��ü���� ��ü�ּҰ��� �ٸ��� ��µȴ�. */
		/* c.toString() �� {��������}�� ���� �͸� �˾Ƶθ� �ȴ�. */
		System.out.println(c.toString());  
		//��ü�� �ּҰ��� ���, ���ڿ� ��ȯ
		System.out.println(c1); 
		//��ü�� �ּҰ��� ���, ���ڿ� ��ȯ
		
		
		
		
	}
	
}