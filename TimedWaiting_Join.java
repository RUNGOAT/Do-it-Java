package threadstates.EX04;

class MyThread1 extends Thread {
	@Override
	public void run() {
			for (long i = 0; i < 1000000000L; i++) {}			// 시간 지연
	}
}

class MyThread2 extends Thread {
	MyThread1 myThread1;
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	@Override
	public void run() {
		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- join(...) 진행 중 interrupt() 발생");
			for (long i = 0; i < 1000000000L; i++) {}			// 시간 지연
		}
	}
}

public class TimedWaiting_Join {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}			// 쓰레드 시작 준비 시간
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
		// TIMED_WAITING
		myThread2.interrupt();
		try {Thread.sleep(100);} catch (InterruptedException e) {}			// interrupt() 준비 시간
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
	}
}
