/**
 * 
 */
package it.unitn.master.egov.aibpm.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author mekjr1
 *
 */
@WebService(serviceName = "NameToIPConverter", 
portName = "NameToIPConverterPort", 
wsdlLocation = "file:cxf-bc/NameToIPConverter.wsdl", 
targetNamespace = "http://egov/aibpm/finalproject/", 
endpointInterface = "it.unitn.master.egov.aibpm.ws.NameToIP")
public class NameToIPImpl implements NameToIP {

	/* (non-Javadoc)
	 * @see it.unitn.master.egov.aibpm.ws.NameToIP#convertNameToIP(java.lang.String)
	 */
	@WebMethod(operationName = "nameToIPConveverter", action = "convertName")
	@WebResult(name = "nameToIPConverterResult", targetNamespace = "http://egov/aibpm/finalproject/")
	public String convertNameToIP(String domain) {
		
	            String line;
	            Process p;
	            String IP ="";
				try {
					p = Runtime.getRuntime().exec(
					        "C:/windows/system32/ping.exe "+ domain);
					 /**
		             * Create a buffered reader from the Process' input stream.
		             */
		            BufferedReader input = new BufferedReader(new InputStreamReader(p
		                    .getInputStream()));
		 
		            /**
		             * Loop through the input stream to print the program output into console.
		             */
		            
		            while ((line = input.readLine()) != null) {
		            	if(line.contains("Pinging"))
		            		IP=line.substring(line.indexOf("[")+1, line.indexOf("]"));
		                
		            }
		           
		            /**
		             * Finally close the reader
		             */
		            input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	           
	            return IP;
	        
	    }
	}


