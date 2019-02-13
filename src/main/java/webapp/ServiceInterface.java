package webapp;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@SuppressWarnings("DefaultAnnotationParam")
@WebService(targetNamespace = "http://localhost:8888/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface ServiceInterface {

    @WebMethod
    int getSquare(int i);
}
