package threadproperties.EX02;

// 우선순위
class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100000000; i++) {}			// 시간 지연용
		System.out.println(getName() + " 우선순위: " + getPriority());
	}
}

public class ThreadProperties_2 {
	public static void main(String[] args) {
		
		// 	CPU 코어 수
		System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors());
		
		// 우선순위 자동 지정
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.start();
		}
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// 우선순위 직접 지정	
		for(int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 쓰레드");
			if (i == 9) thread.setPriority(10);
			thread.start();
		}
	}
}
