package com.falabella.sodimac.model.soaphandlers;

import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
 
/**
 *
 * @author www.javadb.com
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
 
    public boolean handleMessage(SOAPMessageContext smc) {
 
        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
 
        if (outboundProperty.booleanValue()) {
 
            SOAPMessage message = smc.getMessage();
 
            try {
 
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();
                SOAPElement clientService =
                        header.addChildElement("ClientService", "cli", "http://mdwcorp.falabella.com/common/schema/clientservice");
 
                SOAPElement country =
                        clientService.addChildElement("country", "cli","http://mdwcorp.falabella.com/common/schema/clientservice");
                country.addTextNode("CL");
 
                SOAPElement commerce =
                        clientService.addChildElement("commerce", "cli","http://mdwcorp.falabella.com/common/schema/clientservice");
                commerce.addTextNode("Sodimac");
                
                SOAPElement channel =
                        clientService.addChildElement("channel", "cli","http://mdwcorp.falabella.com/common/schema/clientservice");
                channel.addTextNode("Portal");
                
                //Print out the outbound SOAP message to System.out
                message.writeTo(System.out);
                System.out.println("");
                 
            } catch (Exception e) {
                e.printStackTrace();
            }
 
        } else {
            try {
                 
                //This handler does nothing with the response from the Web Service so
                //we just print out the SOAP message.
                SOAPMessage message = smc.getMessage();
                message.writeTo(System.out);
                System.out.println("");
 
            } catch (Exception ex) {
                ex.printStackTrace();
            } 
        }
 
 
        return outboundProperty;
 
    }
 
    public Set getHeaders() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return null;
    }
 
    public boolean handleFault(SOAPMessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }
 
    public void close(MessageContext context) {
    //throw new UnsupportedOperationException("Not supported yet.");
    }
}