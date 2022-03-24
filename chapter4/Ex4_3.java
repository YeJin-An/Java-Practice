import java.util.Scanner; // Scanner클래스를 사용하기 위해 추가

class Ex4_3 {
	public static void main(String[] args) {  
		System.out.print("실수를 입력해봐라!! ");
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble(); // 화면을 통해 입력받은 숫자를 input에 저장

		if(input == (int)input) {
			System.out.println("실수가 아닌 정수!");	
		} else { // input!=0인 경우
			System.out.println("실수: "+input);
		}
	} // main의 끝
}