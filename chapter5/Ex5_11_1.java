import java.util.*;

class Ex5_11_1 {
	public static void main(String[] args) {
		
		// �迭�ٷ��__�迭�� �񱳿� ���
		
		String[][] str2D = new String[][] {
			{"aaa","bbb"},
			{"AAA","BBB"}
		};
		
		String[][] str2D2 = new String[][] {
			{"aaa","bbb"},
			{"AAA","BBB"}
		};
		
		// equals�� == 1����,  deepEquals == 2�����̻� ������ 
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
	}
}