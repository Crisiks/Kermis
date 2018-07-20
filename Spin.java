package kermis;


public class Spin extends Attractie{
	Spin (String deNaam, double dePrijs, int deOppervlakte, int deKaartjesVerkocht) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht = deKaartjesVerkocht;
	}
	
	void spinOproepen(Spin sp1) {
		System.out.println(sp1.naam + " blaast iedereen van zijn sokken!" + "\n" + "Wat wil je weten?");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'k':
				System.out.println("Er zijn al " + sp1.kaartjesverkocht + " kaartjes verkocht.");
				break;
			case 'o':
				double omzetSpin = sp1.kaartjesverkocht * sp1.prijs;
				System.out.println("Er is al €" + omzetSpin + " omzet gedraaid.");
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
		}		
	}

}