package coo.sh.excepton;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {

		//Exception
		//Error

		//Error : 컴파일 시 에러
		//Exception : 실행 중 발생하는 에러  콘솔창에서 에러나는 부분
		//예외처리
		//목적 : 비정상적인 종료를 막고 정상적으로 프로그램을 진행하기 위해서
		//방법 : 
		//1. try{예외가 발생할 만한 코드}
		//   catch(발생할 Exception타입의 매개변수){
		//	               예외가 발생했을 시 실행되는 부분
		//	}finally{
		//		예외가 발생하든 안하든 무조건 실행 	
		//	}

		int a=10;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 입력");
		int num = 0;
		
		
		int result =0;
		
		try {
			num = sc.nextInt();
			result = a/num;
			//throw new ArithmeticException();
			int [] ar = new int[3];
			System.out.println(ar[result]);

		}catch(Exception e) {
			//보통 이걸로 예외처리를 한다.
			e.printStackTrace();//개발 시 예외 메시지 확인
			
			//배포시에는 변경
		}
		/*
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외 발생");
		}catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("배열길이가 안 맞음");
		}catch (InputMismatchException e) {
			System.out.println("misMatch");
		}*/
		System.out.println(a+num);
		System.out.println("종료");
	}

}
