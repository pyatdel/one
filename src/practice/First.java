package practice;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in); //�Է¹ޱ�
		System.out.print("a �Է� :"); 
		a = sc.nextInt(); // �Է¹��� ������ ����ȭ 
        
		Scanner sc2 = new Scanner(System.in); 
		System.out.print("b �Է� :"); 
        b = sc.nextInt(); // �Է¹��� ������ ����ȭ
        
        Cal cal = new Cal(); //Cal Ŭ���� ������ Ÿ�� ����
        cal.a(a, b); //a, b ��������
        }
}
//int�� �Է� ���� ���� nextInt, char�� �Է� ���� ���� (char)System.in.read, char�� ������ �Է� ���� ���� nextLine 