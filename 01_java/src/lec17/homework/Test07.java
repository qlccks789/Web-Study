package lec17.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 *  stream.txt 파일의 내용을 읽어서 아래와 같이 실행하도록 프로그램 작성
 *  
 *  main 메서드의 내용은 수정하지 않는다.
 *  
 *  main 메서드에 선언된 코드 수행시 
 *  
 *  1. test.txt, abc.txt 파일이 생성되어야 한다.
 *  2. 생성된 test.txt 파일의 내용은 아래와 같아야 한다.
	   commons-fileupload
	   commons-fileupload
	   1.3.1
	3. 생성된 abc.txt 파일의 내용은 아래와 같아야 한다.
	   abcd
	   efg
	   hijk
 */
class MultipartRequest{
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	BufferedWriter bw;
	List<MultipartFile> list;
	HashMap<String, String> fileMap;
	HashMap<String, String> dataMap;
	public MultipartRequest() {
		super();
		
	}
	public MultipartRequest(String fName) throws Exception{
		super();
		fr = new FileReader(fName);
		br = new BufferedReader(fr);
		list = new ArrayList<>();
		fileMap = new HashMap<>();
		dataMap = new HashMap<>();
		int pos = 0;
		while(true) {
			String s = br.readLine();
			if(s == null) break;
			if(s.contains("=")) {
				int idx = s.indexOf("=");
				if(s.contains("filename")) {
					String []tmp = s.substring(idx+2).replaceAll("[=,;, ]","").split("\"");					
				
					fw = new FileWriter(tmp[2]);
					System.out.println(tmp[2]);
					br.readLine();
					br.readLine();
					String t = "";
					while(true) {
						String x = br.readLine();
						if(x.contains("WebKit")) break;
						t += x +"\n";
						fileMap.put(tmp[2], t);
					}
					
					MultipartFile mpf = new MultipartFile();
					mpf.setName(tmp[2]);
					mpf.setContent(t);
					
					list.add(mpf);
					bw = new BufferedWriter(fw);
					bw.write(fileMap.get(tmp[2]));
					bw.close();

				}else{
					
					String []tmp = s.substring(idx+2).split("\"");
					br.readLine();
					dataMap.put(tmp[0], br.readLine());
				}
			}
		}
		fw.close();
		br.close();
		fr.close();
	}
	
	public String getParameter(String name)  {
		return dataMap.get(name);
	}
	public MultipartFile[] getFiles() {
		int size = dataMap.size();
		MultipartFile tmp [] = new MultipartFile[size];
		for(int i = 0; i < size;i++) {
			tmp[i] = list.get(i);
		}
		return tmp;
	}
	
}

class MultipartFile{
	String name;
	String Content;
	public void setContent(String content) {
		Content = content;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
		
		}
	public String getContent() {
		return Content;
		}
}

public class Test07 {
	public static void main(String[] args) throws Exception {
		
		// stream.txt 파일의 내용을 파싱하여 아래의 주석에 해당하는 내용들이 출력될 수 있도록 
		// MultipartRequest, MultipartFile 클래스 및 메서드를 작성합니다.
		
		MultipartRequest request = new MultipartRequest("stream.txt");
		
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		// hong 이 출력됨
		String pass = request.getParameter("pass");
		System.out.println("pass : " + pass);
		// 1234 가 출력됨
		// test.txt, abc.txt 의 내용을 가지고 있는 배열을 반환
		MultipartFile[] files = request.getFiles();
		
		System.out.println(files.length);

		// 2 가 출력
		
		// test.txt 이 출력
		System.out.println(files[0].getName());
		
//		commons-fileupload
//		commons-fileupload   이 출력됨
		 
		System.out.println(files[0].getContent());
//		 abc.txt 이 출력
		System.out.println(files[1].getName());
//		abcd
//		efg
//		hijk		이 출력됨
		System.out.println(files[1].getContent());
		
	}

}