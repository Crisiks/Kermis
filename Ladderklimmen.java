package kermis;

public class Ladderklimmen extends Attractie{
	Ladderklimmen (String deNaam, double dePrijs, int deOppervlakte, int i) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht[0] = i;
	}
	
	void ladderklimmenOproepen(Ladderklimmen l1, Kassa kassa1) {
		System.out.println(l1.naam + " heeft al veel bezoekers uitgedaagd! Wat wil je weten?" + "\n" + "[v]erkoop een kaartje, [k]aantal kaartjes verkocht, [o]omzet, [t]terug naar hoofdmenu.");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'v':
				l1.kaartjesverkocht[0]++;
				terugNaarSubmenu(l1, kassa1);
				break;
			case 'k':
				System.out.println("Er zijn al " + l1.kaartjesverkocht + " kaartjes verkocht.");
				terugNaarSubmenu(l1, kassa1);
				break;
			case 'o':
				double omzetLadderklimmen = l1.kaartjesverkocht[0] * l1.prijs;
				System.out.println("Er is al €" + omzetLadderklimmen + " omzet gedraaid.");
				terugNaarSubmenu(l1, kassa1);
				break;
			case 't':
				kassa1.attractieOproepen(kassa1);
			default:
				System.out.println("Dat is geen geldige keuze.");
				terugNaarSubmenu(l1, kassa1);
			}		
		}
	void terugNaarSubmenu(Ladderklimmen l1, Kassa kassa1) {
		ladderklimmenOproepen(l1, kassa1);
		}
}