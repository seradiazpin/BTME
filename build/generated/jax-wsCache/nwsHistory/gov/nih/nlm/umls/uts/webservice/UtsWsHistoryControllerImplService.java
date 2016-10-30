
package gov.nih.nlm.umls.uts.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UtsWsHistoryControllerImplService", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", wsdlLocation = "https://uts.nlm.nih.gov:443/services/nwsHistory?wsdl")
public class UtsWsHistoryControllerImplService
    extends Service
{

    private final static URL UTSWSHISTORYCONTROLLERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException UTSWSHISTORYCONTROLLERIMPLSERVICE_EXCEPTION;
    private final static QName UTSWSHISTORYCONTROLLERIMPLSERVICE_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsHistoryControllerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://uts.nlm.nih.gov:443/services/nwsHistory?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UTSWSHISTORYCONTROLLERIMPLSERVICE_WSDL_LOCATION = url;
        UTSWSHISTORYCONTROLLERIMPLSERVICE_EXCEPTION = e;
    }

    public UtsWsHistoryControllerImplService() {
        super(__getWsdlLocation(), UTSWSHISTORYCONTROLLERIMPLSERVICE_QNAME);
    }

    public UtsWsHistoryControllerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UTSWSHISTORYCONTROLLERIMPLSERVICE_QNAME, features);
    }

    public UtsWsHistoryControllerImplService(URL wsdlLocation) {
        super(wsdlLocation, UTSWSHISTORYCONTROLLERIMPLSERVICE_QNAME);
    }

    public UtsWsHistoryControllerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UTSWSHISTORYCONTROLLERIMPLSERVICE_QNAME, features);
    }

    public UtsWsHistoryControllerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtsWsHistoryControllerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UtsWsHistoryController
     */
    @WebEndpoint(name = "UtsWsHistoryControllerImplPort")
    public UtsWsHistoryController getUtsWsHistoryControllerImplPort() {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsHistoryControllerImplPort"), UtsWsHistoryController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtsWsHistoryController
     */
    @WebEndpoint(name = "UtsWsHistoryControllerImplPort")
    public UtsWsHistoryController getUtsWsHistoryControllerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsHistoryControllerImplPort"), UtsWsHistoryController.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UTSWSHISTORYCONTROLLERIMPLSERVICE_EXCEPTION!= null) {
            throw UTSWSHISTORYCONTROLLERIMPLSERVICE_EXCEPTION;
        }
        return UTSWSHISTORYCONTROLLERIMPLSERVICE_WSDL_LOCATION;
    }

}