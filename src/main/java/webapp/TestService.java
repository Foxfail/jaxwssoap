package webapp;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@SuppressWarnings("DefaultAnnotationParam") // чтобы не ругался на @SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@WebService(targetNamespace = "http://localhost:8888/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class TestService implements ServiceInterface {

//    @WebMethod
//    public String sayHello(String msg){
//        return "Hello "+msg;
//    }

    public static void main(String[] args) {
        System.out.println("webservice: Start");
        Endpoint.publish("http://localhost:8888/", new TestService());
    }

    @WebMethod
    public int getSquare(int i) {
        System.out.println("getSquare: Start");
        return i * i;
    }
}