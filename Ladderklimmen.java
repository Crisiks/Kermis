package kermis;

public class Ladderklimmen extends Attractie{
	Ladderklimmen (String deNaam, double dePrijs, int deOppervlakte, int deKaartjesVerkocht) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht = deKaartjesVerkocht;
	}
	
	void ladderklimmenOproepen(Ladderklimmen l1) {
		System.out.println(l1.naam + " heeft al veel gasten uitgedaagd!" + "\n" + "Wat wil je weten?");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'k':
				System.out.println("Er zijn al " + l1.kaartjesverkocht + " kaartjes verkocht.");
				break;
			case 'o':
				double omzetLadderklimmen = l1.kaartjesverkocht * l1.prijs;
				System.out.println("Er is al €" + omzetLadderklimmen + " omzet gedraaid.");
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
			}		
		}
}