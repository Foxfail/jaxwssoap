package webapp;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(targetNamespace = "http://localhost:8888/testWS")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class TestService implements ServiceInterface {

//    @WebMethod
//    public String sayHello(String msg){
//        return "Hello "+msg;
//    }

    public static void main(String[] args){
        Endpoint.publish("http://localhost:8888/testWS", new TestService());
    }
    @WebMethod
    public int getSquare(int i){
        return i*i;
    }
}