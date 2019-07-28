/**
 *  라이브러리 활용 파일 업로드
 *  
 *  cos.jar 파일 
 */
package kr.co.mlec.jsp04.fileupload;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/jsp04/fileupload/test01.do")
public class Test01 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 파라미터 정보 못가져온다. 포멧 형식이 다르다.
		String msg = request.getParameter("msg");
		System.out.println("msg : " + msg);
		
		// cos.jar 에 포함되어 있는 클래스
		/*
		 *   하는 일
		 *   1. 지정된 디렉토리에 사용자가 업로드한 파일을 생성한다.
		 *   2. 사용자가 보내준 정보를 파싱해서 api 메서드로 접근해서 
		 *      사용할 수 있게 제공
		 */
		MultipartRequest mRequest = new MultipartRequest(
				request, 
				"c:/bit2019/upload", //  
				1024 * 1024 * 100,  // 
				"utf-8", // 
				new DefaultFileRenamePolicy()
		);
		System.out.println("파일 업로드 성공함...");
		
		// MultipartRequest 클래스에서 필요한 정보를 뽑기
		// 파라미터 정보 뽑기
		msg = mRequest.getParameter("msg");
		System.out.println("msg : " + msg);
		
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









