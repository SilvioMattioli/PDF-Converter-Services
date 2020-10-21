
package com.muhimbi.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WebServiceFaultException", targetNamespace = "http://types.muhimbi.com/2009/10/06")
public class DocumentConverterServiceProcessChangesWebServiceFaultExceptionFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private WebServiceFaultException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DocumentConverterServiceProcessChangesWebServiceFaultExceptionFaultFaultMessage(String message, WebServiceFaultException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DocumentConverterServiceProcessChangesWebServiceFaultExceptionFaultFaultMessage(String message, WebServiceFaultException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.muhimbi.ws.WebServiceFaultException
     */
    public WebServiceFaultException getFaultInfo() {
        return faultInfo;
    }

}
