package decorator;

import decorator.impl.decorators.EncryptMessage;
import decorator.impl.decorators.SOAPEnvelopMessage;
import decorator.impl.decorators.XMLFormatterDecorate;
import decorator.impl.message.CustomerMessage;
import decorator.impl.message.IMessage;

/**
 * Clase principal del proyecto que utilizaremos para comprobar la efectividad del patrón Decorator
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class DecoratorMain {

	public static void main(String[] args) {
		
		CustomerMessage customerMessage = new CustomerMessage("VictorHugo", "victor03016@gmail.com", "627100491");
		System.out.println("Original Message =>\n" + customerMessage + "\n");

		IMessage message1 = new EncryptMessage("usuarios", "123456", 
				new SOAPEnvelopMessage(new XMLFormatterDecorate(customerMessage))).processMessage();
		System.out.println("message1 ==============================>\n" + message1.getContent() + "\n\n");
		
		
		IMessage message2 = new SOAPEnvelopMessage(new EncryptMessage("usuarios", "123456", new XMLFormatterDecorate(customerMessage))).processMessage();
		System.out.println("message2 ==============================>\n" + message2.getContent() + "\n\n");

	}
	
}
