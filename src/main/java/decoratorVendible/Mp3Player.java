package decoratorVendible;

public class Mp3Player extends AutoDecorator {

	public Mp3Player(Vendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescription() {
		return getVendible().getDescription() + " + Mp3Player";
	}

	@Override
	public int getPrice() {
		return getVendible().getPrice() + 200;
	}

}
