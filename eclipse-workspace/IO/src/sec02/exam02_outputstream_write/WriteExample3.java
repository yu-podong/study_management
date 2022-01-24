package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("test1.txt");
		byte[] data = "ABC".getBytes();
		os.write(data, 1, 2); // 
		os.flush();
		os.close();
	}

}
//string 객체는 불변성
