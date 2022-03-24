import java.util.Scanner;

class Ex4_4 {
	public static void main(String[] args) { 
		String grade  = " ";   // 점수를 저장하기 위한 변수
		int score = 0;  // 공백으로 초기화

		System.out.print("최종학력은? ");
		Scanner scanner = new Scanner(System.in);
		grade = scanner.nextLine(); // 화면을 통해 입력받은 숫자를 score에 저장

		System.out.println(grade);
		if (grade.length()<=2) {         // score가 90점 보다 같거나 크면 A학점
			 score = 0;             
		} else if (grade.length() == 4) {   // score가 80점 보다 같거나 크면 B학점 
			 score = 3; 
		} else if (grade.length() == 3) {   // score가 70점 보다 같거나 크면 C학점 
			 score = 4; 
		} else {
			score = 1;
		}
		// 앞에서  이미 처리된 것이라면, 무조건 정확히 적지 않아도 처리 됨.
		System.out.println("졸업할 횟수는 "+ score +"번 입니다.");
	}
}