import java.util.*;

class Ex4_20 {
	public static void main(String[] args) { 
		
		/* ������ ���ش� �Ǵ� �� ó�� ������ ������, 
		     ���� �����ؼ� �ϰ��� �ϴ� ������ for���� ���ط� ���� ���ظ� �ߴ�.*/
		
		int menu = 0, num  = 0;
		Scanner scanner = new Scanner(System.in);

		Like:// while���� �̸�ǥ ����!!
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");

			String tmp = scanner.nextLine();  // String
			menu = Integer.parseInt(tmp);     // Int

			if(menu==0) {  
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (!(1<= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;		
			} // if�� ��!!

			for(;;) {
		      System.out.print("����� ���� �Է��ϼ���.(��� ����:0, ��ü ����:99)>");
				tmp = scanner.nextLine();    // ȭ�鿡�� �Է¹��� ������ tmp�� ����
				num = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

				if(num==0)  
					break;        // break for�� ��

				if(num==99) 
					break Like;  // break �̸�ǥ:for��  �̸�ǥ!!, ��

				// ���� switch���� ���!!!!
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
			} // for�� 
		} // while
	} // main
}