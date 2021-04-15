package decorator.impl.message;

/**
 * La interface IMessage corresponde al IComponente de la estructura del patrón,
 * todos los componentes y decoradores que creemos deberán implementar esta
 * interface.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface IMessage {

	public IMessage processMessage();

	public String getContent();

	public void setContent(String content);

}
