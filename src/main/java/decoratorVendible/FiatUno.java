package decoratorVendible;

/**
 * Componente concreto
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class FiatUno extends Auto {

	@Override
	public String getDescription() {
		return "Fiat Uno modelo 2020";
	}

	@Override
	public int getPrice() {
		return 12000;
	}

}
