package Thread2;
public class ThreadNameExample {
	public static void main(String[] args) {
		// currentThread()는 코드 실행하는 현재 스레드 객체의 참조를 얻는다.
		Thread mainThread = Thread.currentThread(); 
		System.out.println("프로그램 시작 스레드 이름: "+ mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();	
	}
}

// ThreadA와 ThreadB의 차이점
// A는 setName으로 이름 변경
// B는 하지 않아서 자동 설정됨 Thread-n 형식으로