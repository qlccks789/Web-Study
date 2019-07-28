/**
 *  업로드 되는 파일이 저장되는 폴더의 경로 관리
 *  저장되는 파일의 이름 정책을 정하기..
 */
package kr.co.mlec.jsp04.fileupload;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/jsp04/fileupload/test03.do")
public class Test03 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 모듈별 디렉토리 생성 저장하기
		String uploadRoot = "c:/bit2019/upload";
		SimpleDateFormat sdf = new SimpleDateFormat(
				"/yyyy/MM/dd"
		);
		String path = "/board" + sdf.format(new Date());
		File file = new File(uploadRoot + path);
		if (file.exists() == false) file.mkdirs();
		
		MultipartRequest mRequest = new MultipartRequest(
				request, 
				uploadRoot + path, //  
				1024 * 1024 * 100,  // 
				"utf-8", // 
				new FunnyFileRenamePolicy()
		);
		System.out.println("파일 업로드 성공함...");
		
		// 파일에 대한 정보 뽑기
		// <input type="file" name="attach1">
		File f1 = mRequest.getFile("attach1");
		// 사용자가 파일을 선택하지 않은 경우 null이 설정됨
		if (f1 != null) {
			System.out.println("attach1 에 입력된 파일 정보");
			System.out.println("파일크기(byte) : " + f1.length());
			System.out.println(
					"사용자가 올린 파일명 : " + 
			        mRequest.getOriginalFileName("attach1")
			);
			System.out.println(
					"서버에 실제 저장된 파일명 : " + 
					mRequest.getFilesystemName("attach1") 
			);
		}

		File f2 = mRequest.getFile("attach2");
		// 사용자가 파일을 선택하지 않은 경우 null이 설정됨
		if (f2 != null) {
			System.out.println("attach2 에 입력된 파일 정보");
			System.out.println("파일크기(byte) : " + f2.length());
			System.out.println(
					"사용자가 올린 파일명 : " + 
			        mRequest.getOriginalFileName("attach2")
			);
			System.out.println(
					"서버에 실제 저장된 파일명 : " + 
					mRequest.getFilesystemName("attach2") 
			);
		}
		
	}
	
	/*
	// 실제 전송되는 파일의 내용 출력하기
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		InputStream in = request.getInputStream();
		Scanner sc = new Scanner(in);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			out.print(line);
		}
		out.close();
	}
	*/
}









