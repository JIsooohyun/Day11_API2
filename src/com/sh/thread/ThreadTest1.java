package com.sh.thread;

public class ThreadTest1 {
	public static void main(String[] args) {
		
		//동시에 일을 하고 싶을 때 사용하는 Thread
		
//		ThreadEat te = new ThreadEat();
//		ThreadTv tv = new ThreadTv();
//		
//		//run메서드 호출 금지
//		//start()
//		
//		//te.start();
//		//tv.start();
//		ThreadMusic tm = new ThreadMusic();
//		Thread t = new Thread(tm, "iu");
//		Thread t2 = new Thread(tm, "suji");
//		
//		t.start();
		
		int a, b;
		boolean c, d;
		a=10;
		b=0;
		a*=b=5;
		c=(a!=b);
		d=(a==b);
		System.out.println("a : "+a+", c: "+c+", d : "+d);
		
	}

}
