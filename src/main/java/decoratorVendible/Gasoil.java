package decoratorVendible;

public class Gasoil extends AutoDecorator {

	public Gasoil(Vendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescription() {
		return getVendible().getDescription() + " + Gasolina";
	}

	@Override
	public int getPrice() {
		return getVendible().getPrice() + 1000;
	}
}
