package kr.co.mlec.jsp04.fileupload;

import java.io.File;
import java.util.UUID;

import com.oreilly.servlet.multipart.FileRenamePolicy;

public class FunnyFileRenamePolicy implements FileRenamePolicy {
	@Override
	public File rename(File f) {
		// c:/bit2019/aaa.txt
		
		// c:/bit2019
		String parent = f.getParent();
		
		// 사용자가 선택한 이름 : aaa.txt
		String name = f.getName();
		
		// 확장자 
		String ext = "";
		
		// abcd.jpg
		// index : 4
		// name.substring(index) : .jpg
		int index = name.lastIndexOf(".");
		if (index != -1) ext = name.substring(index);
		
		// 사용자가 선택한 파일 이름에서 확장자 부분은 유지하고 이름 부분만을
		// 고유한 값으로 설정한다.
		String uName = UUID.randomUUID().toString();
//		return new File(parent + "/" + uName + ext);
		return new File(parent, uName + ext);
	}
}











