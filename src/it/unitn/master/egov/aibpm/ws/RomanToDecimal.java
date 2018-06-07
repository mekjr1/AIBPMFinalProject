package it.unitn.master.egov.aibpm.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.ws.Endpoint;

//import javax.xml.ws.Endpoint;

public class RomanToDecimal {
	public static void main(String[] args) throws IOException {


		Endpoint.publish("http://localhost:8080/WS/NameToIPConverter",
			new NameToIPImpl());
	}
	
}