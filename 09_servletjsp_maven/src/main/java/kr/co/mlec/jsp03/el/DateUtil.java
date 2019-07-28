package kr.co.mlec.jsp03.el;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String today() {
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd"
		);
		return sdf.format(new Date());
	}
}










