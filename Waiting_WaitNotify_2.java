package threadstates.EX07;

class DataBox {
	int data;
	
	synchronized void inputData(int data) {
		this.data = data;
		System.out.println("입력 데이터: " + data);
	}
	synchronized void outputData() {
		System.out.println("출력 데이터: " + data);
	}
}

public class Waiting_WaitNotify_2 {
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
