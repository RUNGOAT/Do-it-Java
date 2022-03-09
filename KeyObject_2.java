package synchroinizedmethodandblock.EX05;

class MyData {
	synchronized void abc() {
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}			// 시간 지연
		}
	}
	
	synchronized void bcd() {
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}			// 시간 지연
		}
	}
	
	void cde() {
		synchronized(new Object()) {
			for(int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 시간 지연
			}
		}
	}
}

public class KeyObject_2 {
	public static void main(String[] args) {
		// 공유 객체
		MyData myData = new MyData();
		
		// 3개의 쓰레드가 각각의 메서드 호출
		new Thread() {
			public void run() {
				myData.abc();
			}
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
			}
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			}
		}.start();
	}
}
