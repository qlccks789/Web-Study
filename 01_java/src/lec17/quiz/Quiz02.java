/** 
 *   현재 시간에 대한 디렉토리 생성하기 위한 프로그램 작성
 *   
 *   현재 시간 정보를 얻어와  년 월 일 시에 해당하는 디렉토리를 
 *   data/lec17 밑에 생성한다.
 *   
 *   예> 2020-07-15 17:05:22  일 경우
 *      data/lec17/2020/07/15/17
 */
package lec17.quiz;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz02 {

	public static void main(String[] args) {
		new File(
			"data/lec17" + 
			new SimpleDateFormat("/yyyy/MM/dd/HH").format(new Date())
		).mkdirs();
	}

}
































