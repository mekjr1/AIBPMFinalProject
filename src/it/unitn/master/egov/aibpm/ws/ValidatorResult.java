/**
 * 
 */
package it.unitn.master.egov.aibpm.ws;

/**
 * @author mekjr1
 *
 */
public class ValidatorResult {
	
	private String testSubject;
	private String result;
	private String reason;
	private String sugestion;
	
	public String getTestSubject() {
		return testSubject;
	}
	public void setTestSubject(String testSubject) {
		this.testSubject = testSubject;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getSugestion() {
		return sugestion;
	}
	public void setSugestion(String sugestion) {
		this.sugestion = sugestion;
	}


}
