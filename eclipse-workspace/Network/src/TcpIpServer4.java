import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer4 implements Runnable {
	ServerSocket serverSocket;
	Thread[] threadArr;
	
	public static void main(String args[])
	{
		TcpIpServer4 server=new TcpIpServer4(5);
		server.start();
	}


	public TcpIpServer4(int num) {
		try {
			//서버소켓을 생성하여 7777번 포트와 결합시킨다.
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime()+"서버가 준비되었습니다.");
			threadArr=new Thread[num];
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		for(int i=0; i<threadArr.length; i++) {
			threadArr[i] = new Thread(this);
			threadArr[i].start();
		}
	}
		
	public void run() {
		while(true) {
			try {
				System.out.println(getTime()+"연결요청을 기다립니다.");
				//서버 소켓은 클라이언트의 연결요청이 올 때까지 기다린다.
				//클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓 생성
				Socket socket = serverSocket.accept(); // 연결수락
				System.out.println(getTime()+socket.getInetAddress()+"로 부터 연결요청이 들어왔습니다.");
				
				//소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				//원격소켓(remote socket)에 데이터를 보낸다.
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime()+"데이터를 전송했습니다.");
				
				dos.close();
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//현재시간을 문자열로 반환하는 함수
	static String getTime() {
		String name = Thread.currentThread().getName();
		SimpleDateFormat f= new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date()+name);
	}
}//class



