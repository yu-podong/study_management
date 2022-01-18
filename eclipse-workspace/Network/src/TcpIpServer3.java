import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

//5초라는 접속요청시간 부여 메소드
public class TcpIpServer3 {
	public static void main(String args[])
	{
		ServerSocket serverSocket = null;
		
		try {
			//서버소켓을 생성하여 7777번 포트와 결합시킨다.
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime()+"서버가 준비되었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				//서버소켓
				System.out.println(getTime()+"연결요청을 기다립니다.");
				
				//요청대기시간
				serverSocket.setSoTimeout(5*1000);
				
				//서버 소켓은 클라이언트의 연결요청이 올 때까지 기다린다.
				//클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓 생성
				Socket socket = serverSocket.accept(); // 연결수락
				System.out.println(getTime()+socket.getInetAddress()+"로 부터 연결요청이 들어왔습니다.");
				
				System.out.println("getPort():"+socket.getPort());
				System.out.println("getLocalPort():"+socket.getLocalPort());
				
				//소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				//원격소켓(remote socket)에 데이터를 보낸다.
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime()+"데이터를 전송했습니다.");
				
				dos.close();
				socket.close();
			
			//하위Exception부터 써줘야함.
			}catch(SocketTimeoutException e) {
				System.out.println("지정된 시간동안 접속요청이 없어서 서버를 종료합니다.");
				System.exit(0);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}//main

//	private static String getTime() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	//현재시간을 문자열로 반환하는 함수
	static String getTime() {
		SimpleDateFormat f= new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
