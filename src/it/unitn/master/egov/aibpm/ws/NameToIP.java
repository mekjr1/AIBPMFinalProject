package it.unitn.master.egov.aibpm.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "NameToIPConverter", 

targetNamespace = "http://egov/aibpm/finalproject/" 
)
public interface NameToIP {
	
	@WebMethod(operationName = "nameToIPConveverter", action = "convertName")
	@WebResult(name = "nameToIPConverterResult", targetNamespace = "http://egov/aibpm/finalproject/")
	public String convertNameToIP(@WebParam( name="domain", targetNamespace="http://egov/aibpm/finalproject/")String domain);
	
}
