/**
 *  
 */
package advance;

import util.SQLExecutor;

public class Test08 {
	public static void main(String[] args) {
		int result = -1;
		try {
			result = SQLExecutor.update(
					"delete from tb_board where no = ?",
					26
					);
			System.out.println("result : " + result);
			
			SQLExecutor.update(
					"update tb_board set title = ?, content = ? where no = ?", 
					"연습입니다,",
					"이것은 모듈화된 수정입니다.",
					26
					);
			System.out.println("result : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
