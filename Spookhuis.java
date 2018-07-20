package kermis;

public class Spookhuis extends Attractie{
	Spookhuis (String deNaam, double dePrijs, int deOppervlakte, int deKaartjesVerkocht) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht = deKaartjesVerkocht;
	}

void spookhuisOproepen(Spookhuis spk1) {
	System.out.println(spk1.naam + " jaagt al honderden de stuipen op het lijf!" + "\n" + "Wat wil je weten?");
	char c = scanner.next().charAt(0);
	switch (c) {
		case 'k':
			System.out.println("Er zijn al " + spk1.kaartjesverkocht + " kaartjes verkocht.");
			break;
		case 'o':
			double omzetSpookhuis = spk1.kaartjesverkocht * spk1.prijs;
			System.out.println("Er is al €" + omzetSpookhuis + " omzet gedraaid.");
			break;
		default:
			System.out.println("Dat is geen geldige keuze.");
		}		
	}
}
