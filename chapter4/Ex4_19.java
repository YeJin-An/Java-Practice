class Ex4_19
{
	public static void main(String[] args)
	{
      // Loop1이라는 것을 for문의 이름표를 붙여주는 것이다???
		YeJin : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j%9 == 0)
						break YeJin; // 어?? 이렇게 사용이 된다규??
//						
				// 0이 되는 순간 for문을 그만두세요!!
					System.out.println(i+"*"+ j +"="+ i*j);
					
				} // end of for i -> for문이 끝났어요!!
				System.out.println();
				
		} // end of Loop1 -> 이름표를 붙친 for문이 끝났어요

	}
}