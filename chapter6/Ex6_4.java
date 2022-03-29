import java.util.*;

class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		
		mm.printDugudan(3);
		long result = mm.max(5, 4);
		long result1 = mm.add(5L, 3L); // add메서드 호출.
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		//매개변수(파라미터)-> 같은타입!!

		System.out.println("max(5, 4) = " + result);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + Math.round(result4));
	}
 }

 class MyMath { 
	//매개변수(파라미터)-> 같은타입!!
	 void printDugudan(int dan) {
		 if(!(2<=dan && dan<=9))return;
		 
		 for(int i=1; i<=9; i++) {
			 System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		 }
//		 return;
	 }
	 
	long add(long a, long b) { 
		long result = a + b;
		return result; //return a + b;
	}
	long max(long a, long b) {return a>b? a : b;}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {return a / b;}
 }
