package webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public class client {

    public static void main(String[] args) throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:8888/testWS?wsdl");
        //check above URL in browser, you should see WSDL file

        //creating QName using targetNamespace and name
//        QName qname = new QName("http://service.jaxws.journaldev.com/", "PersonServiceImplService");
        QName qname = new QName("http://localhost:8888/testWS", "TestServiceService");

        Service service = Service.create(wsdlURL, qname);

        service.addPort(qname, SOAPBinding.SOAP12HTTP_BINDING, wsdlURL.toString());
        //We need to pass interface and model beans to client
//        TestService ps = service.getPort(TestService.class);
        ServiceInterface ps = service.getPort(qname, ServiceInterface.class);



        //add person
        System.out.println("Add Person Status=" + ps.getSquare(3));

    }

}
