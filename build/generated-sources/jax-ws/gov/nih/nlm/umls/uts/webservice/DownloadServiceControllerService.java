
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
@WebServiceClient(name = "DownloadServiceControllerService", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", wsdlLocation = "https://uts.nlm.nih.gov:443/services/download?wsdl")
public class DownloadServiceControllerService
    extends Service
{

    private final static URL DOWNLOADSERVICECONTROLLERSERVICE_WSDL_LOCATION;
    private final static WebServiceException DOWNLOADSERVICECONTROLLERSERVICE_EXCEPTION;
    private final static QName DOWNLOADSERVICECONTROLLERSERVICE_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "DownloadServiceControllerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://uts.nlm.nih.gov:443/services/download?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DOWNLOADSERVICECONTROLLERSERVICE_WSDL_LOCATION = url;
        DOWNLOADSERVICECONTROLLERSERVICE_EXCEPTION = e;
    }

    public DownloadServiceControllerService() {
        super(__getWsdlLocation(), DOWNLOADSERVICECONTROLLERSERVICE_QNAME);
    }

    public DownloadServiceControllerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOWNLOADSERVICECONTROLLERSERVICE_QNAME, features);
    }

    public DownloadServiceControllerService(URL wsdlLocation) {
        super(wsdlLocation, DOWNLOADSERVICECONTROLLERSERVICE_QNAME);
    }

    public DownloadServiceControllerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOWNLOADSERVICECONTROLLERSERVICE_QNAME, features);
    }

    public DownloadServiceControllerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DownloadServiceControllerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DownloadServiceController
     */
    @WebEndpoint(name = "DownloadServiceControllerPort")
    public DownloadServiceController getDownloadServiceControllerPort() {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "DownloadServiceControllerPort"), DownloadServiceController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DownloadServiceController
     */
    @WebEndpoint(name = "DownloadServiceControllerPort")
    public DownloadServiceController getDownloadServiceControllerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "DownloadServiceControllerPort"), DownloadServiceController.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOWNLOADSERVICECONTROLLERSERVICE_EXCEPTION!= null) {
            throw DOWNLOADSERVICECONTROLLERSERVICE_EXCEPTION;
        }
        return DOWNLOADSERVICECONTROLLERSERVICE_WSDL_LOCATION;
    }

}
