package in.sunnyit.exceptionHandle;

import java.time.LocalDate;

public class ExceptionInfo {
	
	private String exCode;
	
	private String exMsg;
	
	private LocalDate exDate;
	
	
	

	@Override
	public String toString() {
		return "ExceptionInfp [exCode=" + exCode + ", exMsg=" + exMsg + ", exDate=" + exDate + "]";
	}

	public String getExCode() {
		return exCode;
	}

	public void setExCode(String exCode) {
		this.exCode = exCode;
	}

	public String getExMsg() {
		return exMsg;
	}

	public void setExMsg(String exMsg) {
		this.exMsg = exMsg;
	}

	public LocalDate getExDate() {
		return exDate;
	}

	public void setExDate(LocalDate exDate) {
		this.exDate = exDate;
	}
	

}
