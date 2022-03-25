import java.util.*;

class Ex4_15 {
	public static void main(String[] args) { 
		int input  = 0, answer = 0;

		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력해봐!!");
		
		// do-while문은 사용자가 입력 받을 대, 주로 사용이 된다.
		do {
			input = scanner.nextInt();

			if(input > answer) {
				System.out.print("좀 큰데??");	
			} else if(input < answer) {
				System.out.print("깡따구가 왜이래!!");			
			}
		} while(input!=answer); //새미콜론을 잊지 말자!!

		System.out.println("센스가 있군");
	}
}