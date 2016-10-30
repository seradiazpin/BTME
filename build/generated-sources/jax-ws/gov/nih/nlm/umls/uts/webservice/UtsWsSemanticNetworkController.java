
package gov.nih.nlm.umls.uts.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UtsWsSemanticNetworkController", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UtsWsSemanticNetworkController {


    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns gov.nih.nlm.umls.uts.webservice.SemanticTypeDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticType", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticType")
    @ResponseWrapper(localName = "getSemanticTypeResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypeResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticType/Fault/UtsFault")
    })
    public SemanticTypeDTO getSemanticType(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns gov.nih.nlm.umls.uts.webservice.SemanticNetworkRelationLabelDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticNetworkRelationLabel", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticNetworkRelationLabel")
    @ResponseWrapper(localName = "getSemanticNetworkRelationLabelResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticNetworkRelationLabelResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabel/Fault/UtsFault")
    })
    public SemanticNetworkRelationLabelDTO getSemanticNetworkRelationLabel(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInheritedSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInheritedSemanticTypeRelations")
    @ResponseWrapper(localName = "getInheritedSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInheritedSemanticTypeRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInheritedSemanticTypeRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInheritedSemanticTypeRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInheritedSemanticTypeRelations/Fault/UtsFault")
    })
    public List<SemanticTypeRelationDTO> getInheritedSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInheritedSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInheritedSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getInheritedSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInheritedSemanticNetworkRelationLabelRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInheritedSemanticNetworkRelationLabelRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInheritedSemanticNetworkRelationLabelRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInheritedSemanticNetworkRelationLabelRelations/Fault/UtsFault")
    })
    public List<SemanticNetworkRelationLabelRelationDTO> getInheritedSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInverseSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInverseSemanticTypeRelations")
    @ResponseWrapper(localName = "getInverseSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInverseSemanticTypeRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseSemanticTypeRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseSemanticTypeRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseSemanticTypeRelations/Fault/UtsFault")
    })
    public List<SemanticTypeRelationDTO> getInverseSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticTypeRelations")
    @ResponseWrapper(localName = "getAllSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticTypeRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticTypeRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticTypeRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticTypeRelations/Fault/UtsFault")
    })
    public List<SemanticTypeRelationDTO> getAllSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInverseInheritedSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInverseInheritedSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getInverseInheritedSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInverseInheritedSemanticNetworkRelationLabelRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseInheritedSemanticNetworkRelationLabelRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseInheritedSemanticNetworkRelationLabelRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseInheritedSemanticNetworkRelationLabelRelations/Fault/UtsFault")
    })
    public List<SemanticNetworkRelationLabelRelationDTO> getInverseInheritedSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInverseInheritedSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInverseInheritedSemanticTypeRelations")
    @ResponseWrapper(localName = "getInverseInheritedSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInverseInheritedSemanticTypeRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseInheritedSemanticTypeRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseInheritedSemanticTypeRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseInheritedSemanticTypeRelations/Fault/UtsFault")
    })
    public List<SemanticTypeRelationDTO> getInverseInheritedSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInverseSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInverseSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getInverseSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetInverseSemanticNetworkRelationLabelRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseSemanticNetworkRelationLabelRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseSemanticNetworkRelationLabelRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getInverseSemanticNetworkRelationLabelRelations/Fault/UtsFault")
    })
    public List<SemanticNetworkRelationLabelRelationDTO> getInverseSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @param semanticRelationLabelId
     * @param relatedSemanticTypeId
     * @return
     *     returns gov.nih.nlm.umls.uts.webservice.SemanticNetworkRelationLabelRelationDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticNetworkRelationLabelRelation", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticNetworkRelationLabelRelation")
    @ResponseWrapper(localName = "getSemanticNetworkRelationLabelRelationResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticNetworkRelationLabelRelationResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRelationRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRelationResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRelation/Fault/UtsFault")
    })
    public SemanticNetworkRelationLabelRelationDTO getSemanticNetworkRelationLabelRelation(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId,
        @WebParam(name = "semanticRelationLabelId", targetNamespace = "")
        String semanticRelationLabelId,
        @WebParam(name = "relatedSemanticTypeId", targetNamespace = "")
        String relatedSemanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticNetworkRelationLabelRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRelations/Fault/UtsFault")
    })
    public List<SemanticNetworkRelationLabelRelationDTO> getSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @param relatedSemanticTypeId
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticNetworkRelationLabelRelationsForPair", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticNetworkRelationLabelRelationsForPair")
    @ResponseWrapper(localName = "getSemanticNetworkRelationLabelRelationsForPairResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticNetworkRelationLabelRelationsForPairResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRelationsForPairRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRelationsForPairResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticNetworkRelationLabelRelationsForPair/Fault/UtsFault")
    })
    public List<SemanticNetworkRelationLabelRelationDTO> getSemanticNetworkRelationLabelRelationsForPair(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId,
        @WebParam(name = "relatedSemanticTypeId", targetNamespace = "")
        String relatedSemanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param semanticGroup
     * @param version
     * @return
     *     returns gov.nih.nlm.umls.uts.webservice.SemanticTypeGroupDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypeGroup", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypeGroup")
    @ResponseWrapper(localName = "getSemanticTypeGroupResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypeGroupResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeGroupRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeGroupResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeGroup/Fault/UtsFault")
    })
    public SemanticTypeGroupDTO getSemanticTypeGroup(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticGroup", targetNamespace = "")
        String semanticGroup)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @param relatedSemanticTypeId
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypeRelationsForPair", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypeRelationsForPair")
    @ResponseWrapper(localName = "getSemanticTypeRelationsForPairResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypeRelationsForPairResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRelationsForPairRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRelationsForPairResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRelationsForPair/Fault/UtsFault")
    })
    public List<SemanticTypeRelationDTO> getSemanticTypeRelationsForPair(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId,
        @WebParam(name = "relatedSemanticTypeId", targetNamespace = "")
        String relatedSemanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @param semanticRelationLabelId
     * @param relatedSemanticTypeId
     * @return
     *     returns gov.nih.nlm.umls.uts.webservice.SemanticTypeRelationDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypeRelation", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypeRelation")
    @ResponseWrapper(localName = "getSemanticTypeRelationResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypeRelationResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRelationRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRelationResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRelation/Fault/UtsFault")
    })
    public SemanticTypeRelationDTO getSemanticTypeRelation(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId,
        @WebParam(name = "semanticRelationLabelId", targetNamespace = "")
        String semanticRelationLabelId,
        @WebParam(name = "relatedSemanticTypeId", targetNamespace = "")
        String relatedSemanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypeRelations")
    @ResponseWrapper(localName = "getSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypeRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypeRelations/Fault/UtsFault")
    })
    public List<SemanticTypeRelationDTO> getSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param semanticGroup
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticTypeDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypesByGroup", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypesByGroup")
    @ResponseWrapper(localName = "getSemanticTypesByGroupResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetSemanticTypesByGroupResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypesByGroupRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypesByGroupResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getSemanticTypesByGroup/Fault/UtsFault")
    })
    public List<SemanticTypeDTO> getSemanticTypesByGroup(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticGroup", targetNamespace = "")
        String semanticGroup)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getAllSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticNetworkRelationLabelRelationsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticNetworkRelationLabelRelationsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticNetworkRelationLabelRelationsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticNetworkRelationLabelRelations/Fault/UtsFault")
    })
    public List<SemanticNetworkRelationLabelRelationDTO> getAllSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticNetworkRelationLabelDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticNetworkRelationLabels", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticNetworkRelationLabels")
    @ResponseWrapper(localName = "getAllSemanticNetworkRelationLabelsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticNetworkRelationLabelsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticNetworkRelationLabelsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticNetworkRelationLabelsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticNetworkRelationLabels/Fault/UtsFault")
    })
    public List<SemanticNetworkRelationLabelDTO> getAllSemanticNetworkRelationLabels(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticTypeGroupDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticTypeGroups", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticTypeGroups")
    @ResponseWrapper(localName = "getAllSemanticTypeGroupsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticTypeGroupsResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticTypeGroupsRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticTypeGroupsResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticTypeGroups/Fault/UtsFault")
    })
    public List<SemanticTypeGroupDTO> getAllSemanticTypeGroups(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.umls.uts.webservice.SemanticTypeDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticTypes", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticTypes")
    @ResponseWrapper(localName = "getAllSemanticTypesResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.umls.uts.webservice.GetAllSemanticTypesResponse")
    @Action(input = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticTypesRequest", output = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticTypesResponse", fault = {
        @FaultAction(className = UtsFault_Exception.class, value = "http://webservice.uts.umls.nlm.nih.gov/UtsWsSemanticNetworkController/getAllSemanticTypes/Fault/UtsFault")
    })
    public List<SemanticTypeDTO> getAllSemanticTypes(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

}
