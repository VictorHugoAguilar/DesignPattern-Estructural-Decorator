package decorator.impl.decorators;

import decorator.impl.message.IMessage;

/**
 * Clase decoradora que encapsula el contenido del mensaje en formato SOAP.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class SOAPEnvelopMessage extends MessageDecorator {

	public SOAPEnvelopMessage(IMessage message) {
		super(message);
	}

	@Override
	public IMessage processMessage() {
		message.processMessage();
		message = SOAPEnvelopMessage();
		return message;
	}

	private IMessage SOAPEnvelopMessage() {
		String soap = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\""
				+ "xmlns:sert=\"http://service.dishweb.cl.com/\">\n    <soapenv:Header/>\n    <soapenv:Body>\n"
				+ message.getContent() + "\n    </soapenv:Body>\n</soapenv:Envelope>";
		message.setContent(soap);
		return message;
	}

}
