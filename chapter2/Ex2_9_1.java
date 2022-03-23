
public class Ex2_9_1 {
	public static void main(String[] args) {
		System.out.println("실수-> "+10.0/3);
		System.out.println("정수-> "+10/3);
		// 출력할 때 이렇게 사용하는 것을 잊지 말자!!
		
		System.out.printf("age:%d year:%d\n",14,2017);
		
		double f = 123.4567890f; //double과 float 구분!!
		System.out.printf("소수점아래 6자리 -> %f\n",f);
		System.out.printf("지수형식 -> %e\n",f);
		
		System.out.printf("간략한 형식 -> %g\n",123.456789);
		System.out.printf("간락한 형식 -> %g\n",0.00000000001);
		
		System.out.printf("%s\n", Integer.toBinaryString(15));
		// 10진수를 2진수로 바꾸는  {메소드 = toBinaryString}
		
		System.out.printf("[%5d]\n", 10);  // 5자리-값은 공백
		System.out.printf("[%-5d]\n", 10); // 왼쪽 정렬
		System.out.printf("[%05d]\n", 10); // 앞에 모두 0 출력
		
		System.out.printf("[%5d]\n",1234567); 
		// 저장할 값이 존재하면 그냥 출력으로 이어짐!!
		
	}

}
