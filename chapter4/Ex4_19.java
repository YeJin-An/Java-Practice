class Ex4_19
{
	public static void main(String[] args)
	{
      // Loop1�̶�� ���� for���� �̸�ǥ�� �ٿ��ִ� ���̴�???
		YeJin : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j%9 == 0)
						break YeJin; // ��?? �̷��� ����� �ȴٱ�??
//						
				// 0�� �Ǵ� ���� for���� �׸��μ���!!
					System.out.println(i+"*"+ j +"="+ i*j);
					
				} // end of for i -> for���� �������!!
				System.out.println();
				
		} // end of Loop1 -> �̸�ǥ�� ��ģ for���� �������

	}
}