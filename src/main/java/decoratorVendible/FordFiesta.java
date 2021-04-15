package decoratorVendible;

/**
 * Clase componente concreto
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class FordFiesta extends Auto {

	@Override
	public String getDescription() {
		return "Ford Fiesta modelo 2019";
	}

	@Override
	public int getPrice() {
		return 14500;
	}

}
