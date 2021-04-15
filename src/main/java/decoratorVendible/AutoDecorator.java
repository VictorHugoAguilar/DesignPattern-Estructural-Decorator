package decoratorVendible;

/**
 * La clase Decoradora Base tiene un campo para referenciar un objeto envuelto.
 * El tipo del campo debe declararse como la interfaz del componente para que
 * pueda contener tanto los componentes concretos como los decoradores. La clase
 * decoradora base delega todas las operaciones al objeto envuelto.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public abstract class AutoDecorator implements Vendible {

	private Vendible vendible;

	public AutoDecorator(Vendible vendible) {
		setVendible(vendible);
	}

	public Vendible getVendible() {
		return vendible;
	}

	public void setVendible(Vendible vendible) {
		this.vendible = vendible;
	}

}
