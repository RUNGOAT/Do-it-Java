package createandstartthread.EX04;


//#1. 방법2(M2). Runnable 인터페이스 상속하여 클래스 생성 case2 : 3개의 쓰레드 생성

class SMIFileRunnable implements Runnable {

	@Override
	public void run() {
		// 자막 번호 하나~다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		
		// 자막 번호 출력
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		// 비디오 프레임 번호 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 비디오 프레임 번호 출력
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M2C2 {
	public static void main(String[] args) {
		// SMIFileRunnable 객체 생성
		Runnable smiFileRunnable = new SMIFileRunnable();
		Thread thread = new Thread(smiFileRunnable);
		thread.start();
		
		// VideoFileRunnable 객체 생성
		Runnable videoFileRunnable = new VideoFileRunnable();
		Thread thread1 = new Thread(videoFileRunnable);
		thread1.start();
	}
}
