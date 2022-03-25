import java.util.*;

class Ex4_14 {
	public static void main(String[] args) { 
		int num = 0; // input될 변수 지정 
		int sum = 0; // 계산된 값을 저장될 변수 
		System.out.print("정수형 입력!! ");

		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine(); // 문자열
		num = Integer.parseInt(tmp);     // 숫자
		// 입력받은 타입을 정수형으로 바꿔주는 메소드!!
		
		while(num!=0) {    
	
			sum += num%10;  // 이해가 되었다.	
			System.out.printf("input= %2d , output= %d%n", sum, num);
			// 지시자 안에 숫자는 음... 4칸의 오른쪽 정렬과 같다??
 
			num /= 10;      // 이해가 되었다.   
		}
		// for(num=1234; num>0; num = num/10){
		//     System.out.println(num%10); 
		// }     // num /= 10이 있어 결국 num은 0이 된다.

		System.out.println("total = "+sum);
		
	 /*  1. num!=0 은 num이 0이 아닐 때까지 while이 동작한다.
		 2. sum += num%10 
		 == sum = sum + num%10 
		 // %는 몫과 나머지 중 나머지를 출력하는 산술 연산자 이다.!
		    sum = 0 + 5
		    sum = 5 + 4
		    sum = 9 + 3
		    
		 3. num /= 10 == num = num / 10
		    num = 12345 / 10 == 1234
		    num = 1234  / 10 == 123
		    num = 123   / 10 == 12                */
		
		
		
		
		
		
		
	}
}