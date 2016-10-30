
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nih.nlm.umls.uts.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDownloadArtifact_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getDownloadArtifact");
    private final static QName _GetDownloadArtifactResponse_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getDownloadArtifactResponse");
    private final static QName _GetDownloadArtifacts_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getDownloadArtifacts");
    private final static QName _GetDownloadArtifactsResponse_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getDownloadArtifactsResponse");
    private final static QName _GetDownloadRelease_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getDownloadRelease");
    private final static QName _GetDownloadReleaseResponse_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getDownloadReleaseResponse");
    private final static QName _GetDownloadReleases_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getDownloadReleases");
    private final static QName _GetDownloadReleasesResponse_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getDownloadReleasesResponse");
    private final static QName _GetLatestDownloadRelease_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getLatestDownloadRelease");
    private final static QName _GetLatestDownloadReleaseResponse_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getLatestDownloadReleaseResponse");
    private final static QName _GetLatestDownloadReleaseSet_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getLatestDownloadReleaseSet");
    private final static QName _GetLatestDownloadReleaseSetResponse_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getLatestDownloadReleaseSetResponse");
    private final static QName _GetValidDownloadGroups_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getValidDownloadGroups");
    private final static QName _GetValidDownloadGroupsResponse_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "getValidDownloadGroupsResponse");
    private final static QName _Init_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "init");
    private final static QName _InitResponse_QNAME = new QName("http://webservice.uts.umls.nlm.nih.gov/", "initResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nih.nlm.umls.uts.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDownloadArtifact }
     * 
     */
    public GetDownloadArtifact createGetDownloadArtifact() {
        return new GetDownloadArtifact();
    }

    /**
     * Create an instance of {@link GetDownloadArtifactResponse }
     * 
     */
    public GetDownloadArtifactResponse createGetDownloadArtifactResponse() {
        return new GetDownloadArtifactResponse();
    }

    /**
     * Create an instance of {@link GetDownloadArtifacts }
     * 
     */
    public GetDownloadArtifacts createGetDownloadArtifacts() {
        return new GetDownloadArtifacts();
    }

    /**
     * Create an instance of {@link GetDownloadArtifactsResponse }
     * 
     */
    public GetDownloadArtifactsResponse createGetDownloadArtifactsResponse() {
        return new GetDownloadArtifactsResponse();
    }

    /**
     * Create an instance of {@link GetDownloadRelease }
     * 
     */
    public GetDownloadRelease createGetDownloadRelease() {
        return new GetDownloadRelease();
    }

    /**
     * Create an instance of {@link GetDownloadReleaseResponse }
     * 
     */
    public GetDownloadReleaseResponse createGetDownloadReleaseResponse() {
        return new GetDownloadReleaseResponse();
    }

    /**
     * Create an instance of {@link GetDownloadReleases }
     * 
     */
    public GetDownloadReleases createGetDownloadReleases() {
        return new GetDownloadReleases();
    }

    /**
     * Create an instance of {@link GetDownloadReleasesResponse }
     * 
     */
    public GetDownloadReleasesResponse createGetDownloadReleasesResponse() {
        return new GetDownloadReleasesResponse();
    }

    /**
     * Create an instance of {@link GetLatestDownloadRelease }
     * 
     */
    public GetLatestDownloadRelease createGetLatestDownloadRelease() {
        return new GetLatestDownloadRelease();
    }

    /**
     * Create an instance of {@link GetLatestDownloadReleaseResponse }
     * 
     */
    public GetLatestDownloadReleaseResponse createGetLatestDownloadReleaseResponse() {
        return new GetLatestDownloadReleaseResponse();
    }

    /**
     * Create an instance of {@link GetLatestDownloadReleaseSet }
     * 
     */
    public GetLatestDownloadReleaseSet createGetLatestDownloadReleaseSet() {
        return new GetLatestDownloadReleaseSet();
    }

    /**
     * Create an instance of {@link GetLatestDownloadReleaseSetResponse }
     * 
     */
    public GetLatestDownloadReleaseSetResponse createGetLatestDownloadReleaseSetResponse() {
        return new GetLatestDownloadReleaseSetResponse();
    }

    /**
     * Create an instance of {@link GetValidDownloadGroups }
     * 
     */
    public GetValidDownloadGroups createGetValidDownloadGroups() {
        return new GetValidDownloadGroups();
    }

    /**
     * Create an instance of {@link GetValidDownloadGroupsResponse }
     * 
     */
    public GetValidDownloadGroupsResponse createGetValidDownloadGroupsResponse() {
        return new GetValidDownloadGroupsResponse();
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link DlReleaseDTO }
     * 
     */
    public DlReleaseDTO createDlReleaseDTO() {
        return new DlReleaseDTO();
    }

    /**
     * Create an instance of {@link DlArtifactDTO }
     * 
     */
    public DlArtifactDTO createDlArtifactDTO() {
        return new DlArtifactDTO();
    }

    /**
     * Create an instance of {@link DlGroupDTO }
     * 
     */
    public DlGroupDTO createDlGroupDTO() {
        return new DlGroupDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDownloadArtifact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getDownloadArtifact")
    public JAXBElement<GetDownloadArtifact> createGetDownloadArtifact(GetDownloadArtifact value) {
        return new JAXBElement<GetDownloadArtifact>(_GetDownloadArtifact_QNAME, GetDownloadArtifact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDownloadArtifactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getDownloadArtifactResponse")
    public JAXBElement<GetDownloadArtifactResponse> createGetDownloadArtifactResponse(GetDownloadArtifactResponse value) {
        return new JAXBElement<GetDownloadArtifactResponse>(_GetDownloadArtifactResponse_QNAME, GetDownloadArtifactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDownloadArtifacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getDownloadArtifacts")
    public JAXBElement<GetDownloadArtifacts> createGetDownloadArtifacts(GetDownloadArtifacts value) {
        return new JAXBElement<GetDownloadArtifacts>(_GetDownloadArtifacts_QNAME, GetDownloadArtifacts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDownloadArtifactsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getDownloadArtifactsResponse")
    public JAXBElement<GetDownloadArtifactsResponse> createGetDownloadArtifactsResponse(GetDownloadArtifactsResponse value) {
        return new JAXBElement<GetDownloadArtifactsResponse>(_GetDownloadArtifactsResponse_QNAME, GetDownloadArtifactsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDownloadRelease }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getDownloadRelease")
    public JAXBElement<GetDownloadRelease> createGetDownloadRelease(GetDownloadRelease value) {
        return new JAXBElement<GetDownloadRelease>(_GetDownloadRelease_QNAME, GetDownloadRelease.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDownloadReleaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getDownloadReleaseResponse")
    public JAXBElement<GetDownloadReleaseResponse> createGetDownloadReleaseResponse(GetDownloadReleaseResponse value) {
        return new JAXBElement<GetDownloadReleaseResponse>(_GetDownloadReleaseResponse_QNAME, GetDownloadReleaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDownloadReleases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getDownloadReleases")
    public JAXBElement<GetDownloadReleases> createGetDownloadReleases(GetDownloadReleases value) {
        return new JAXBElement<GetDownloadReleases>(_GetDownloadReleases_QNAME, GetDownloadReleases.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDownloadReleasesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getDownloadReleasesResponse")
    public JAXBElement<GetDownloadReleasesResponse> createGetDownloadReleasesResponse(GetDownloadReleasesResponse value) {
        return new JAXBElement<GetDownloadReleasesResponse>(_GetDownloadReleasesResponse_QNAME, GetDownloadReleasesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestDownloadRelease }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getLatestDownloadRelease")
    public JAXBElement<GetLatestDownloadRelease> createGetLatestDownloadRelease(GetLatestDownloadRelease value) {
        return new JAXBElement<GetLatestDownloadRelease>(_GetLatestDownloadRelease_QNAME, GetLatestDownloadRelease.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestDownloadReleaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getLatestDownloadReleaseResponse")
    public JAXBElement<GetLatestDownloadReleaseResponse> createGetLatestDownloadReleaseResponse(GetLatestDownloadReleaseResponse value) {
        return new JAXBElement<GetLatestDownloadReleaseResponse>(_GetLatestDownloadReleaseResponse_QNAME, GetLatestDownloadReleaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestDownloadReleaseSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getLatestDownloadReleaseSet")
    public JAXBElement<GetLatestDownloadReleaseSet> createGetLatestDownloadReleaseSet(GetLatestDownloadReleaseSet value) {
        return new JAXBElement<GetLatestDownloadReleaseSet>(_GetLatestDownloadReleaseSet_QNAME, GetLatestDownloadReleaseSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestDownloadReleaseSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getLatestDownloadReleaseSetResponse")
    public JAXBElement<GetLatestDownloadReleaseSetResponse> createGetLatestDownloadReleaseSetResponse(GetLatestDownloadReleaseSetResponse value) {
        return new JAXBElement<GetLatestDownloadReleaseSetResponse>(_GetLatestDownloadReleaseSetResponse_QNAME, GetLatestDownloadReleaseSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidDownloadGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getValidDownloadGroups")
    public JAXBElement<GetValidDownloadGroups> createGetValidDownloadGroups(GetValidDownloadGroups value) {
        return new JAXBElement<GetValidDownloadGroups>(_GetValidDownloadGroups_QNAME, GetValidDownloadGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidDownloadGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "getValidDownloadGroupsResponse")
    public JAXBElement<GetValidDownloadGroupsResponse> createGetValidDownloadGroupsResponse(GetValidDownloadGroupsResponse value) {
        return new JAXBElement<GetValidDownloadGroupsResponse>(_GetValidDownloadGroupsResponse_QNAME, GetValidDownloadGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.uts.umls.nlm.nih.gov/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

}
