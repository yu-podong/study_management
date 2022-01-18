import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpIpMultichatServer {
	//HashMap: 클라이언트 정보를 저장함
		HashMap clients;
		
		TcpIpMultichatServer(){
			clients = new HashMap(); 
			Collections.synchronizedMap(clients); //공유객체인 cilents를 동기화
		}
		
		public void start() {
			ServerSocket serverSocket = null;
			Socket socket = null;
			
			try {
				serverSocket = new ServerSocket(777);
				System.out.println("서버가 준비되었습니다.");
				
			    while(true) {
			    	socket= serverSocket.accept();
			    	System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]");
			    	ServerReceiver thread = new ServerReceiver(socket);
			    	thread.start();
			    }
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}//start()
		
		void sendToAll(String msg) {
			//iterator: set,list 안에 있는 요소들을 반복해서 찾아감
			//keySet(): Set의 key만 보여주는 메소드
			//keySet().iterator(): Set용 iterator
			Iterator it = clients.keySet().iterator(); 
			
			while (it.hasNext()) { //다음 요소가 있는 동안
				try {
					DataOutputStream out = (DataOutputStream)clients.get(it.next());
					out.writeUTF(msg); //문자열 출력
				}catch(IOException e) {}
			}//while
		}//sendToAll
	    public static void main(String[] args) {
	    	new TcpIpMultichatServer().start();
	    }
	    class ServerReceiver extends Thread { //내부 class
	    	Socket socket;
	    	DataInputStream in;
	    	DataOutputStream out;
	    	
	    	ServerReceiver(Socket socket){
	    		this.socket = socket;
	    		try {
	    			in = new DataInputStream(socket.getInputStream());
	    			out = new DataOutputStream(socket.getOutputStream());
	    		}catch(IOException e) {}
	    	}
	    	
	    	public void run() {
	    		String name ="";
	    		try {
	    			name = in.readUTF(); //in에서 문자열 읽기
	    			sendToAll("#"+name+"님이 들어오셨습니다.");
	    			
	    			clients.put(name,out); //put()은 인자로 key와 value를 받는다 주로 HashMap에 이용
	    			System.out.println("현재 서버 접속자 수는"+clients.size()+"입니다.");
	    			
	    			while(in!=null) {
	    				sendToAll(in.readUTF());
	    			}
	    		}catch(IOException e) {
	    			//ignore
	    		}finally {
	    			sendToAll("#"+name+"님이 나가셨습니다.");
	    			clients.remove(name); //key 넘겨주기
	    			System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]");
	    			System.out.println("현재 서버 접속자 수는"+clients.size()+"입니다.");
	    		}//try
	    	}//run
	    }
}
