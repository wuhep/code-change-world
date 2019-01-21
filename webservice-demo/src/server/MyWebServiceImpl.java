
package server;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyWebServiceImpl", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyWebServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://server/", className = "server.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://server/", className = "server.SayHelloResponse")
    @Action(input = "http://server/MyWebServiceImpl/sayHelloRequest", output = "http://server/MyWebServiceImpl/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
