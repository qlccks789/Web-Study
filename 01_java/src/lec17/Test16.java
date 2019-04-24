package lec17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test16 {
	private static void dataWrite() throws Exception {
		FileOutputStream fos = new FileOutputStream("data/lec17/data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeChar('가');  
		dos.writeInt(97);  
		dos.writeDouble(1.1);
		dos.writeUTF("안녕하세요");
		
		dos.close();
		fos.close();
		System.out.println("데이터파일 쓰기 성공");
	}
	
	private static void dataInput() throws Exception {
		FileInputStream fis = new FileInputStream("data/lec17/data.txt");
		// 기본 데이터에 대한 값을 모두 처리하고 싶을 때
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		dis.close();
		fis.close();
		
	}
	
	public static void main(String[] args) {
		try {
			dataWrite();
			dataInput();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}