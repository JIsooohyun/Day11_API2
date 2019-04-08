package coo.sh.excepton;

public class Example2 {

	public void ex2() {
		
		int num=52;
		int num2=82;
		
		int result1 = num+num2;
		int result2 = num-num2;
		
		try {
			if(result1>99 || result2<0) {
				//throw new MyException(); -> git에서 선생님 코드 보고 고치기 !
			}
		}catch(Exception e){
			System.out.println("3자리 몰라요");
		}
				
	}
}
