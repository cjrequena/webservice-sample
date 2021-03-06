
package com.sample.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ISampleWS", targetNamespace = "http://server.webservice.sample.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ISampleWS {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://server.webservice.sample.com", className = "com.sample.webservice.client.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://server.webservice.sample.com", className = "com.sample.webservice.client.HelloResponse")
    @Action(input = "http://server.webservice.sample.com/ISampleWS/helloRequest", output = "http://server.webservice.sample.com/ISampleWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
