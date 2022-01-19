package tw.com.fcb.calcuate;

public class ResultBean {

	private double sumResult;
	private double substractResult;
	private double multiplyResult;
	private double divideResult;
	
	@Override
	public String toString() {
		return "ResultBean [sumResult=" + sumResult + ", substractResult=" + substractResult + ", multiplyResult="
				+ multiplyResult + ", divideResult=" + divideResult + "]";
	}
	
	
	public double getSumResult() {
		return sumResult;
	}
	public void setSumResult(double sumResult) {
		this.sumResult = sumResult;
	}
	public double getSubstractResult() {
		return substractResult;
	}
	public void setSubstractResult(double substractResult) {
		this.substractResult = substractResult;
	}
	public double getMultiplyResult() {
		return multiplyResult;
	}
	public void setMultiplyResult(double multiplyResult) {
		this.multiplyResult = multiplyResult;
	}
	public double getDivideResult() {
		return divideResult;
	}
	public void setDivideResult(double divideResult) {
		this.divideResult = divideResult;
	}
	

	

}
