package webapp;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class client {

    public static void main(String[] args) throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:8888/?wsdl");
        //check above URL in browser, you should see WSDL file

        //creating QName using targetNamespace and name
//        QName qname = new QName("http://service.jaxws.journaldev.com/", "PersonServiceImplService");
        QName qnameService = new QName("http://localhost:8888/", "ServiceImplService");
//        QName qnamePort = new QName("http://localhost:8888/", "ServiceImplPort");

        Service service = Service.create(wsdlURL, qnameService);

//        service.addPort(qname2, SOAPBinding.SOAP12HTTP_BINDING, wsdlURL.toString());

//        ServiceImpl ps = service.getPort(ServiceImpl.class);
        ServiceInterface ps = service.getPort(ServiceInterface.class);

        System.out.println("getSquare = " + ps.getSquare(3));
    }

}
