package coo.sh.excepton;

public class ExceptionTest2 {

	public static void main(String[] args) {

		Example1 ex1 = new Example1();
		try {
			ex1.test(); //호출한 곳에서 예외처리를 꼭 해주세요 -> 보통 메인에서 처리를 해준다. 
		}catch(Exception e) {
			
		}
	}

}
