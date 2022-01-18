import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient5 {
public static void main(String args[]) {
		
		String serverIp="127.0.0.1";
		try {
			Socket socket = new Socket(serverIp,7777);
//		System.out.println("서버에 연결중입니다. 서버 IP: "+serverIp);
		//소켓을 생성하여 연결 요청
		
		
		System.out.println("서버에 연결되었습니다.");
		Sender sender = new Sender(socket);
		Receiver receiver = new Receiver(socket);
		
		sender.start();
		receiver.start();
		
//		InputStream in = socket.getInputStream();
//		DataInputStream dis = new DataInputStream(in);
//		
//		//소켓으로 부터 받은 데이터 출력
//		System.out.println("서버로부터 받은 메시지 :"+dis.readUTF());
//		System.out.println("연결을 종료합니다.");
//		
//		dis.close();
//		socket.close();
//		System.out.println("연결이 종료되었습니다.");
	}catch(ConnectException ce) {
		ce.printStackTrace();
	}catch(IOException ie) {
		ie.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

}
