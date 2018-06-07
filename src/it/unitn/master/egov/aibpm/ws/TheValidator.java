/**
 * 
 */
package it.unitn.master.egov.aibpm.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author mekjr1
 * 
 */
@WebService(name="TheValidatorService", targetNamespace="http://egov/aibpm/finalproject/")
public interface TheValidator {
	

	@WebMethod(operationName="mailValidator", action ="validateEmail")
	@WebResult(name="mailValidatorResul", targetNamespace="")
	public ValidatorResult validateEmail(@WebParam(name="mail", targetNamespace="http://egov/aibpm/finalproject/" )String mail);

	@WebMethod(operationName="BiValidator", action ="validateBi")
	@WebResult(name="BiValidatorResul", targetNamespace="http://egov/aibpm/finalproject/")
	public ValidatorResult validateBI(@WebParam(name="bi", targetNamespace="http://egov/aibpm/finalproject/" )String bi); 

	@WebMethod(operationName="passValidator", action ="validatePass")
	@WebResult(name="passValidatorResul", targetNamespace="http://egov/aibpm/finalproject/")
	public ValidatorResult validatePassport(@WebParam(name="pass", targetNamespace="http://egov/aibpm/finalproject/" )String pass);
	

}
