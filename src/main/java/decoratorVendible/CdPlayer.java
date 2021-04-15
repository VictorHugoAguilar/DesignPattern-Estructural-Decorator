package decoratorVendible;

public class CdPlayer extends AutoDecorator {

	public CdPlayer(Vendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescription() {
		return getVendible().getDescription() + " + CdPlayer";
	}

	@Override
	public int getPrice() {
		return getVendible().getPrice() + 50;
	}

}
