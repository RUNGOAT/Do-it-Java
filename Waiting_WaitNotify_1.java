package threadstates.EX06;

class DataBox {
	boolean isEmpty = true;
	int data;
	
	synchronized void inputData(int data) {
		if(!isEmpty) {
			try {wait();} catch (InterruptedException e) {}				// WAITING
		}
		this.data = data;
		isEmpty = false;
		System.out.println("입력 데이터: " + data);
		notify();
	}
	synchronized void outputData() {
		if(isEmpty) {
			try {wait();} catch (InterruptedException e) {}				// WAITING
		}
		isEmpty = true;
		System.out.println("출력 데이터: " + data);
		notify();
	}
}

public class Waiting_WaitNotify_1 {
	public static void main(String[] args) {
		DataBox databox = new DataBox();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 9; i++) {
					databox.inputData(i);
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 9; i++) {
					databox.outputData();
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
