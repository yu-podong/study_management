import java.net.*;
import java.io.*;

public class NetworkEx4 {
	public static void  main(String args[]) {
		URL url = null;
		BufferedReader input = null;
		String address = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=react";
		String line = "";

		try {
			url = new URL(address);

			//보조스트림 BufferedReader
			//openStream() : 데이터가 흐를 수 있도록 연결해주는 통로 메서드
		    input = new BufferedReader(new InputStreamReader(url.openStream()));
		  

			while((line=input.readLine()) !=null) {
				System.out.println(line);
			}
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
