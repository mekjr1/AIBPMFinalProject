/**
 * 
 */
package it.unitn.master.egov.aibpm.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author mekjr1
 * 
 */
@WebService(serviceName = "TheValidator", 
			portName = "TheValidatorPort", 
			wsdlLocation = "file:cxf-bc/TheValidatorService.wsdl", 
			targetNamespace = "http://egov/aibpm/finalproject/", 
			endpointInterface = "it.unitn.master.egov.aibpm.ws.TheValidator")
public class TheValidatorImpl implements TheValidator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.unitn.master.egov.aibpm.ws.TheValidator#validateEmail(java.lang.String
	 * )
	 */
	@WebMethod(operationName = "mailValidator", action = "validateEmail")
	@WebResult(name = "mailValidatorResul", targetNamespace = "http://egov/aibpm/finalproject/")
	public ValidatorResult validateEmail(String mail) {
		// TODO Auto-generated method stub

		ValidatorResult res = new ValidatorResult();

		res.setTestSubject("mail");

		if (mail.indexOf('@') < 2) {
			res.setSugestion("check the string before @ sign of your mail");
			res.setResult("fail");
			res.setReason("no valid user @ specified mail server");
		}
		if (mail.lastIndexOf(".") - mail.indexOf('@') < 2) {
			res.setSugestion("a domain must have a subdomain");
			res.setResult("fail");
			res.setReason("wrong domain");
		}
		if (mail.split("@")[1].length() < 4) {
			res.setSugestion("an email should have domain");
			res.setResult("fail");
			res.setReason("no valid domain");
		}
		if (mail.split("@")[0].length() < 2) {
			res.setSugestion("an email should have name");
			res.setResult("fail");
			res.setReason("no valid name");
		}

		else {
			res.setReason("sucessfull");
			res.setResult("pass");
			res.setSugestion("no");
		}

		return res;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.unitn.master.egov.aibpm.ws.TheValidator#validateBI(java.lang.String)
	 */
	@WebMethod(operationName = "BiValidator", action = "validateBi")
	@WebResult(name = "BiValidatorResul", targetNamespace = "http://egov/aibpm/finalproject/")
	public ValidatorResult validateBI(String bi) {
		//
		ValidatorResult res = new ValidatorResult();
		res.setTestSubject("BI");

		if (bi.length() != 13) {
			res.setSugestion("Check if you entered 13 character");
			res.setResult("fail");
			res.setReason("incorect number of characters");
		}
		if (!Character.isDigit(bi.charAt(12))) {
			res.setSugestion("Check if the last charater is a digit");
			res.setResult("fail");
			res.setReason("last digit is incorrect");
		}
		if (!bi.startsWith("020") || bi.startsWith("02012")) {
			res.setSugestion("Check if the first 4 digits are correct");
			res.setResult("fail");
			res.setReason("wrong year of issue!");
		} else {
			res.setReason("sucessfull");
			res.setResult("pass");
			res.setSugestion("no");
		}

		return res;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.unitn.master.egov.aibpm.ws.TheValidator#validatePassport(java.lang
	 * .String)
	 */

	@WebMethod(operationName = "passValidator", action = "validatePass")
	@WebResult(name = "passValidatorResul", targetNamespace = "http://egov/aibpm/finalproject/")
	public ValidatorResult validatePassport(String pass) {

		ValidatorResult res = new ValidatorResult();
		res.setTestSubject("passport");

		if (pass.length() != 9) {
			res.setSugestion("Check if you entered 9 digits");
			res.setResult("fail");
			res.setReason("incorrect number of digits");
		} else {
			res.setReason("sucessfull");
			res.setResult("pass");
			res.setSugestion("no");
		}
		return res;
	}

}
