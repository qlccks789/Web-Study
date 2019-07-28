package kr.co.mlec.mvc._04file;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller("kr.co.mlec.mvc._04file.Test")
@RequestMapping("/file")
public class Test {
	
	@RequestMapping("/upload1.do")
	public String test01(String msg, MultipartFile attach) throws Exception {
		
		System.out.println("msg : " + msg);
		System.out.println("attach : " + attach);
		
		// 사용자가 attach 부분에 파일을 선택했는지 확인
		if (attach.isEmpty()) {
			System.out.println("파일 선택하지 않음");
			return "redirect:/index04.jsp";
		} 
		
		// 사용자가 파일을 선택한 경우 - 메모리에 있는 파일의 내용을 서버에 저장
		System.out.println("사용자 파일 선택함");
		System.out.println("사용자가 선택한 파일명 : " + attach.getOriginalFilename());
		// 서버의 특정 공간에 저장
		attach.transferTo(new File("c:/bit2019/upload/" + attach.getOriginalFilename()));
		
		return "redirect:/index04.jsp";
	}
	
	@RequestMapping("/upload2.do")
	public String test02(String msg, List<MultipartFile> attach) throws Exception {
		
		System.out.println("msg : " + msg);
		System.out.println("attach : " + attach);
		
		for (MultipartFile file : attach) {
			
			// 사용자가 attach 부분에 파일을 선택했는지 확인
			if (file.isEmpty()) {
				System.out.println("파일 선택하지 않음");
				return "redirect:/index04.jsp";
			} 
			
			// 사용자가 파일을 선택한 경우 - 메모리에 있는 파일의 내용을 서버에 저장
			System.out.println("사용자 파일 선택함");
			System.out.println("사용자가 선택한 파일명 : " + file.getOriginalFilename());
			// 서버의 특정 공간에 저장
			file.transferTo(new File("c:/bit2019/upload/" + file.getOriginalFilename()));

		}
		
		return "redirect:/index04.jsp";
	}
	
	@RequestMapping("/upload3.do")
	public String test03(FileVO fileVO) throws Exception {
		
		System.out.println("msg : " + fileVO.getMsg());
		
		for (MultipartFile file : fileVO.getAttach1()) {
			if (file.isEmpty()) {
				System.out.println("파일 선택하지 않음");
				break;
			} 
			file.transferTo(new File("c:/bit2019/upload/" + file.getOriginalFilename()));
		}
		for (MultipartFile file : fileVO.getAttach2()) {
			if (file.isEmpty()) {
				System.out.println("파일 선택하지 않음");
				break;
			} 
			file.transferTo(new File("c:/bit2019/upload/" + file.getOriginalFilename()));
		}
		
		return "redirect:/index04.jsp";
	}

}















