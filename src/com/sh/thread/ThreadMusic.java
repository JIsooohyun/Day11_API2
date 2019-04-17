package com.sh.thread;

public class ThreadMusic implements Runnable{

	public void run() {
		this.music();
	}
	
	private void buyTicket() {
		//ticket--;
		//System.out.println("ticket : "+ticket);
	}
	public void music() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println("비트주세요");
		}
	}
}
