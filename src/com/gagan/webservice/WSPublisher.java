package com.gagan.webservice;

import javax.xml.ws.Endpoint;

/* After running this class check http://localhost:8080/WebService/greeting?wsdl
 */
public class WSPublisher {

	public static void main(String[] args) {
			Endpoint.publish("http://localhost:8080/WebService/greeting",new GreetingImpl());
		}
}
