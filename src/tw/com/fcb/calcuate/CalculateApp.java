package tw.com.fcb.calcuate;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class CalculateApp {

	public static void main(String[] args) {
		
		CalculateService service = new CalculateService();

		int result = service.sum(1, 2);
		System.out.println(result);
		
		result = service.sum(2, 3);
		System.out.println(result);
		
		String accountNo = service.getAccountNo(null);
		System.out.println(accountNo);
		
		
		ResultBean myResult = service.calculate(3, 2);
		
//		System.out.println(myresult.getMultiplyResult());
//		System.out.println(myresult.getDivideResult());
		
		System.out.println(myResult);
		
		ResultBean yourResult = new ResultBean();
//		yourResult.setSumResult(myResult.getSumResult());
//		yourResult.setSubstractResult(myResult.getSubstractResult());
//		yourResult.setMultiplyResult(myResult.getMultiplyResult());
//		yourResult.setDivideResult(myResult.getDivideResult());
		
		
		try {
			BeanUtils.copyProperties(yourResult, myResult);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(yourResult);
		
	}

}
