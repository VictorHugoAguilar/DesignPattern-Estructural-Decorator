package decorator.impl.decorators;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import decorator.impl.message.IMessage;
import sun.misc.BASE64Encoder;

/**
 * 
 * Clase decoradora que encripta un mensaje. La clase recibe en su constructor
 * el usuario y password requeridos para encriptar el mensaje.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class EncryptMessage extends MessageDecorator {

	private String user;
	private String password;

	public EncryptMessage(String user, String password, IMessage message) {
		super(message);
		this.user = user;
		this.password = password;
	}

	@Override
	public IMessage processMessage() {
		this.message = message.processMessage();
		encryptMessage();
		return message;
	}

	private IMessage encryptMessage() {
		try {
			// Generamos una clave de 128 bits adecuada para AES
			KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
			keyGenerator.init(128);
			Key key = keyGenerator.generateKey();

			Cipher c = Cipher.getInstance("AES");
			c.init(Cipher.ENCRYPT_MODE, key);

			byte[] encVal = c.doFinal(message.getContent().getBytes());
			String enncryptedValue = new BASE64Encoder().encode(encVal);
	 
			message.setContent(enncryptedValue);
			return message;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
