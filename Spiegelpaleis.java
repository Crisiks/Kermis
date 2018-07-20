package kermis;

public class Spiegelpaleis extends Attractie{
	Spiegelpaleis (String deNaam, double dePrijs, int deOppervlakte, int deKaartjesVerkocht) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht = deKaartjesVerkocht;
	}
	
	void spiegelpaleisOproepen(Spiegelpaleis spp1) {
		System.out.println(spp1.naam + " laat iedereen hun ware ik zien!" + "\n" + "Wat wil je weten?");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'k':
				System.out.println("Er zijn al " + spp1.kaartjesverkocht + " kaartjes verkocht.");
				break;
			case 'o':
				double omzetSpiegelpaleis = spp1.kaartjesverkocht * spp1.prijs;
				System.out.println("Er is al €" + omzetSpiegelpaleis + " omzet gedraaid.");
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
		}		
	}
}