package decoratorVendible;

public class VendibleDemo {

	public static void main(String[] args) {

		Vendible auto = new FiatUno();
		System.out.println("Su precio inicial es " + auto.getPrice());

		auto = new CdPlayer(auto);
		auto = new Gasoil(auto);

		System.out.println(auto.getDescription());
		System.out.println("Su precio es " + auto.getPrice());

		Vendible auto2 = new FordFiesta();
		System.out.println("Su precio inicial es " + auto2.getPrice());

		auto2 = new Gasoil(auto2);
		auto2 = new AireAcondicionado(auto2);
		auto2 = new Mp3Player(auto2);
		
		System.out.println(auto2.getDescription());
		System.out.println("Su precio es " + auto2.getPrice());
	}
}
