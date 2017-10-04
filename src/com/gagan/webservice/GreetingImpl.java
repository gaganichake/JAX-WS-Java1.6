package com.gagan.webservice;

import javax.jws.WebService;

/* To generate client stub go to client project home and run wsimport –s src -d bin http://localhost:8080/WebService/greeting?wsdl
 * where 	-s option to specify where to place generated source file
 * 			-d option to specify where to place generated output file
 */

@WebService(endpointInterface = "com.gagan.webservice.Greeting")
public class GreetingImpl implements Greeting {

	@Override
	public String sayHello(String name){
		return "Hello, Welcom to jax-ws " + name;
	}
}
