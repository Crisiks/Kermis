package kermis;

public class Spookhuis extends Attractie{
	Spookhuis (String deNaam, double dePrijs, int deOppervlakte, int i) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht[0] = i;
	}

void spookhuisOproepen(Spookhuis spk1, Kassa kassa1) throws Exception {
	System.out.println(spk1.naam + " jaagt al honderden de stuipen op het lijf! Wat wil je weten?" + "\n" + "[v]erkoop een kaartje, [k]aantal kaartjes verkocht, [o]omzet, [t]terug naar hoofdmenu.");
	char c = scanner.next().charAt(0);
	switch (c) {
		case 'v':
			spk1.kaartjesverkocht[0]++;
			terugNaarSubmenu(spk1, kassa1);
			break;
		case 'k':
			System.out.println("Er zijn al " + spk1.kaartjesverkocht[0] + " kaartjes verkocht.");
			terugNaarSubmenu(spk1, kassa1);
			break;
		case 'o':
			double omzetSpookhuis = spk1.kaartjesverkocht[0] * spk1.prijs;
			System.out.println("Er is al €" + omzetSpookhuis + " omzet gedraaid.");
			terugNaarSubmenu(spk1, kassa1);
			break;
		case 't':
			kassa1.attractieOproepen(kassa1);
			break;
		default:
			System.out.println("Dat is geen geldige keuze.");
			terugNaarSubmenu(spk1, kassa1);
		}		
	}

void terugNaarSubmenu(Spookhuis spk1, Kassa kassa1) throws Exception {
	spookhuisOproepen(spk1, kassa1);
	}
}
