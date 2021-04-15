package decoratorVendible;

public class AireAcondicionado extends AutoDecorator {

	public AireAcondicionado(Vendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescription() {
		return getVendible().getDescription() + " + AireAcondicionado";
	}

	@Override
	public int getPrice() {
		return getVendible().getPrice() + 200;
	}

}
