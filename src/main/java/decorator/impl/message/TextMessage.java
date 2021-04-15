package decorator.impl.message;

/**
 * Clase utilizxada para crear los mensajes de texto. El mensaje es almacenado
 * en la propiedad content.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class TextMessage implements IMessage {

	private String content;

	public TextMessage() {
	}
	
	public TextMessage(String content) {
		this.content=content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public IMessage processMessage() {
		return this;
	}

}
