import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {
	public static void main(String args[]) {
		
		String serverIp="172.30.2.180";
		try {
		System.out.println("서버에 연결중입니다. 서버 IP: "+serverIp);
		//소켓을 생성하여 연결 요청
		Socket socket = new Socket(serverIp,7777);
		
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		//소켓으로 부터 받은 데이터 출력
		System.out.println("서버로부터 받은 메시지 :"+dis.readUTF());
		System.out.println("연결을 종료합니다.");
		
		dis.close();
		socket.close();
		System.out.println("연결이 종료되었습니다.");
	}catch(ConnectException ce) {
		ce.printStackTrace();
	}catch(IOException ie) {
		ie.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
