package decorator.impl.decorators;

import decorator.impl.message.IMessage;

/**
 * Clase utilizada como base para crear a los decoradores, ésta recibe en el
 * constructor un IMessage. Cada decorador que se cree debberá de heredar de esa
 * clase e implementar los métodos setContent y getContent según se requiera.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public abstract class MessageDecorator implements IMessage {

	protected IMessage message;

	public MessageDecorator(IMessage message) {
		this.message = message;
	}

	@Override
	public String getContent() {
		return message.getContent();
	}

	@Override
	public void setContent(String content) {
		message.setContent(content);
	}

}
