
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
@WebServiceClient(name = "UtsWsMetadataControllerImplService", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", wsdlLocation = "https://uts.nlm.nih.gov:443/services/nwsMetadata?wsdl")
public class UtsWsMetadataControllerImplService
    extends Service
{

    private final static URL UTSWSMETADATACONTROLLERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException UTSWSMETADATACONTROLLERIMPLSERVICE_EXCEPTION;
    private final static QName UTSWSMETADATACONTROLLERIMPLSERVICE_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsMetadataControllerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://uts.nlm.nih.gov:443/services/nwsMetadata?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UTSWSMETADATACONTROLLERIMPLSERVICE_WSDL_LOCATION = url;
        UTSWSMETADATACONTROLLERIMPLSERVICE_EXCEPTION = e;
    }

    public UtsWsMetadataControllerImplService() {
        super(__getWsdlLocation(), UTSWSMETADATACONTROLLERIMPLSERVICE_QNAME);
    }

    public UtsWsMetadataControllerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UTSWSMETADATACONTROLLERIMPLSERVICE_QNAME, features);
    }

    public UtsWsMetadataControllerImplService(URL wsdlLocation) {
        super(wsdlLocation, UTSWSMETADATACONTROLLERIMPLSERVICE_QNAME);
    }

    public UtsWsMetadataControllerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UTSWSMETADATACONTROLLERIMPLSERVICE_QNAME, features);
    }

    public UtsWsMetadataControllerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtsWsMetadataControllerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UtsWsMetadataController
     */
    @WebEndpoint(name = "UtsWsMetadataControllerImplPort")
    public UtsWsMetadataController getUtsWsMetadataControllerImplPort() {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsMetadataControllerImplPort"), UtsWsMetadataController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtsWsMetadataController
     */
    @WebEndpoint(name = "UtsWsMetadataControllerImplPort")
    public UtsWsMetadataController getUtsWsMetadataControllerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsMetadataControllerImplPort"), UtsWsMetadataController.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UTSWSMETADATACONTROLLERIMPLSERVICE_EXCEPTION!= null) {
            throw UTSWSMETADATACONTROLLERIMPLSERVICE_EXCEPTION;
        }
        return UTSWSMETADATACONTROLLERIMPLSERVICE_WSDL_LOCATION;
    }

}
