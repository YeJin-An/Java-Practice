import java.util.*;

class Ex4_20 {
	public static void main(String[] args) { 
		
		/* 솔직히 이해는 되는 것 처럼 생각이 들지만, 
		     직접 변경해서 하고자 하는 열정은 for문의 이해로 나는 이해를 했다.*/
		
		int menu = 0, num  = 0;
		Scanner scanner = new Scanner(System.in);

		Like:// while문에 이름표 부착!!
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

			String tmp = scanner.nextLine();  // String
			menu = Integer.parseInt(tmp);     // Int

			if(menu==0) {  
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1<= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;		
			} // if문 끝!!

			for(;;) {
		      System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
				tmp = scanner.nextLine();    // 화면에서 입력받은 내용을 tmp에 저장
				num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환

				if(num==0)  
					break;        // break for문 끝

				if(num==99) 
					break Like;  // break 이름표:for문  이름표!!, 끝

				// 계산될 switch문을 사용!!!!
				switch(menu) {
					case 1: 
						System.out.println("result="+ num*num);		
						break;
					case 2: 
						System.out.println("result="+ Math.sqrt(num)); 
						break;
					case 3: 
						System.out.println("result="+ Math.log(num));  
						break;
				} 
			} // for문 
		} // while
	} // main
}