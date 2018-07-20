package kermis;

class Hawaii extends Attractie{
	Hawaii (String deNaam, double dePrijs, int deOppervlakte, int deKaartjesVerkocht) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht = deKaartjesVerkocht;
	}

void hawaiiOproepen(Hawaii h1) {
	System.out.println(h1.naam + " gaat vliegensvlug de hoogte in!" + "\n" + "Wat wil je weten?");
	char c = scanner.next().charAt(0);
	switch (c) {
		case 'k':
			System.out.println("Er zijn al " + h1.kaartjesverkocht + " kaartjes verkocht.");
			break;
		case 'o':
			double omzetHawaii = h1.kaartjesverkocht * h1.prijs;
			System.out.println("Er is al €" + omzetHawaii + " omzet gedraaid.");
			break;
		default:
			System.out.println("Dat is geen geldige keuze.");
		}		
	}
}