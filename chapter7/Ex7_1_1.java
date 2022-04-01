class MyPoint3 extends Object{
	int x;
	int y;
	String getLocation() {
		return "x:" + x +",y: " + y ;
	}
}

class MyPoint3D extends MyPoint3 {
	int z, i;
	// ������ getLocation()�� �������̵� [����ġ��]
	public String getLocation() {
		return "x: "+x+", y: "+y+", z: "+z; 
	}
	
	// ObjectŬ������ toString()�� �������̵�
	public String toString() {
		return "x: "+x+", y: "+y+", z: "+z+", i: "+i;
	}
	
	MyPoint3D(int x, int y){ //������ �Դϴ�.
		this.x = x;
		this.y = y;
	}
}

class Ex7_1_1 {
	public static void main(String args[]) {
		
		MyPoint3D p = new MyPoint3D(3,5);
		System.out.println("p.x: "+p.x);
		System.out.println("p.y: "+p.y);
		System.out.println("p.z: "+p.z);
		System.out.println(p.getLocation());
		System.out.println(p);
		
		
		
	}
	
}