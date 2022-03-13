package threadstates.EX03;

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- sleep() 진행 중 interrupt() 발생");
			for (long i = 0; i < 1000000000L; i++) {}			// 시간 지연
		}
	}
}

public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}			// 쓰레드 시작 준비 시간
		System.out.println("MyThread State = " + myThread.getState());
		// TIMED_WAITING
		myThread.interrupt();
		try {Thread.sleep(100);} catch (InterruptedException e) {}			// interrupt() 준비 시간
		System.out.println("MyThread State = " + myThread.getState());
	}
}