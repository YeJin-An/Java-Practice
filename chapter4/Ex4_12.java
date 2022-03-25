class Ex4_12 {
	public static void main(String[] args) { 
		int i= 5; // 반복할 횟수를 넣는다.
		String name = "예진";

		while(i--!=0) {
			// i-- 는 후위형으로 작동이 됩니다!!
			System.out.println(i + "번  {"+name+"} 너무 매력있어!!");
		}
		System.out.println("조건을 다 썻어!");
		// 초기화, 조건문, 반복문
	} 
}