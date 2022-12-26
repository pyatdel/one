package practice;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in); //입력받기
		System.out.print("a 입력 :"); 
		a = sc.nextInt(); // 입력받은 데이터 정수화 
        
		Scanner sc2 = new Scanner(System.in); 
		System.out.print("b 입력 :"); 
        b = sc.nextInt(); // 입력받은 데이터 정수화
        
        Cal cal = new Cal(); //Cal 클래스 데이터 타입 설정
        cal.a(a, b); //a, b 가져가기
        }
}
//int를 입력 받을 때는 nextInt, char를 입력 받을 때는 (char)System.in.read, char를 여러개 입력 받을 때는 nextLine 