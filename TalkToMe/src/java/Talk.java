
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceFeature;
import org.scify.newsumserver.server.newsumfreeservice.NewSumFreeService_Service;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author scify
 */
public class Talk extends NewSumFreeService_Service{

    public Talk() {
    }

    public Talk(WebServiceFeature... features) {
        super(features);
    }

    public Talk(URL wsdlLocation) {
        super(wsdlLocation);
    }

    public Talk(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, features);
    }

    public Talk(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Talk(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }
    
}
