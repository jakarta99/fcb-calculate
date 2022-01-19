package tw.com.fcb.calcuate;

import org.apache.commons.lang3.StringUtils;

public class CalculateService {

	public int sum(int a, int b) {
		return a+b;
	}
	
	public ResultBean calculate(double a, double b) {
		
		ResultBean myresult = new ResultBean();
		
		myresult.setSumResult(a+b);
		myresult.setSubstractResult(a-b);
		myresult.setMultiplyResult(a*b);
		myresult.setDivideResult(a/b);
		
		return myresult;
	}
	
	
	
	

	/**
	 * 取得銀行帳號
	 * @param idno
	 * @return
	 */
	public String getAccountNo(String idno) {
	
		if(StringUtils.equals(idno, "A123456789")) {
			return "0001-1234-5678-9999";
		} else {
			return "0000-0000-0000-0000";
		}
		
		
	}
	
	
	
	
	
}
