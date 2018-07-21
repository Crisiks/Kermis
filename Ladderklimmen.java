package kermis;

public class Ladderklimmen extends Attractie implements GokAttractie{
	Ladderklimmen (String deNaam, double dePrijs, int deOppervlakte, int i) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht[0] = i;
	}
	double [] omzetLadderklimmen = new double[1];
	
	
	void ladderklimmenOproepen(Ladderklimmen l1, Kassa kassa1, Belastinginspecteur bi1) {
		System.out.println(l1.naam + " heeft al veel bezoekers uitgedaagd! Wat wil je weten?" + "\n" + "[v]erkoop een kaartje, [k]aantal kaartjes verkocht, [o]omzet, [t]terug naar hoofdmenu.");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'v':
				l1.kaartjesverkocht[0]++;
				omzetLadderklimmen[0] = l1.kaartjesverkocht[0] * l1.prijs;
				l1.kansSpelBelastingBetalen(l1, omzetLadderklimmen, bi1);
				terugNaarSubmenu(l1, kassa1, bi1);
				break;
			case 'k':
				System.out.println("Er zijn al " + l1.kaartjesverkocht[0] + " kaartjes verkocht.");
				terugNaarSubmenu(l1, kassa1, bi1);
				break;
			case 'o':
				System.out.println("Er is al €" + omzetLadderklimmen[0] + " omzet gedraaid.");	
				System.out.print("Daarvoor is €");
				if((belastinguitomzet[0] - bi1.bedragVoorBelasting[0]) > 0) {
					System.out.println((belastinguitomzet[0] - bi1.bedragVoorBelasting[0]) + " gereserveerd voor de belasting.");
				}else {System.out.println("0 gereserveerd voor de belasting.");				
				}
				terugNaarSubmenu(l1, kassa1, bi1);
				break;
			case 't':
				kassa1.attractieOproepen(kassa1);
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
				terugNaarSubmenu(l1, kassa1, bi1);
			}		
		}
	
	void terugNaarSubmenu(Ladderklimmen l1, Kassa kassa1, Belastinginspecteur bi1) {
		ladderklimmenOproepen(l1, kassa1, bi1);
	}
}