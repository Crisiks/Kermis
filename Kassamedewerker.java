package kermis;

import java.util.Scanner;

public class Kassamedewerker {
	Scanner scanner = new Scanner(System.in);
	
	String naam;
	Kassamedewerker (String deNaam) {
		naam = deNaam;
	}
	
	void attractieOproepen() {
		Botsautos b1 = new Botsautos("2Fast2Furious: Overdrive", 2.50, 100, 732);
		Spin sp1 = new Spin("TwistR", 2.25, 75, 523);
		Spiegelpaleis spp1 = new Spiegelpaleis("DoppleGangLand", 2.25, 75, 196);
		Spookhuis spk1 = new Spookhuis("Haunted House on the Hill: the Reckoning", 3.20, 125, 1002);
		Hawaii h1 = new Hawaii("Apollo 13: Deep Impact", 2.90, 20, 631);
		Ladderklimmen l1 = new Ladderklimmen("Summit: the Mount Everest experience", 5.00, 3, 306);
		
		System.out.println("Welke attractie wil je oproepen?");
		int gekozenNummer = scanner.nextInt();
		System.out.println(gekozenNummer);
		switch (gekozenNummer) {
			case 1:
				b1.botsautosOproepen(b1);
				break;
			case 2:
				sp1.spinOproepen(sp1);
				break;
			case 3:
				spp1.spiegelpaleisOproepen(spp1);
				break;
			case 4:
				spk1.spookhuisOproepen(spk1);
				break;
			case 5:
				h1.hawaiiOproepen(h1);
				break;
			case 6:
				l1.ladderklimmenOproepen(l1);
				break;
			case 7:
				kermisOproepen(b1, sp1, spp1, spk1, h1, l1);
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");		
		}
	}
	
	void kermisOproepen(Botsautos b1, Spin sp1, Spiegelpaleis spp1, Spookhuis spk1, Hawaii h1, Ladderklimmen l1) {
		System.out.println("De kermis draait overuren!" + "\n" + "Wat wil je weten?");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'k':
				int totaalAantalKaartjes = b1.kaartjesverkocht + sp1.kaartjesverkocht + spp1.kaartjesverkocht + spk1.kaartjesverkocht + h1.kaartjesverkocht + l1.kaartjesverkocht; 
				System.out.println("Er zijn al " + totaalAantalKaartjes + " kaartjes verkocht.");
				attractieOproepen();
				break;
			case 'o':
				double omzetKermis = (b1.kaartjesverkocht * b1.prijs) + (sp1.kaartjesverkocht * sp1.prijs) + (spp1.kaartjesverkocht * spp1.prijs) + (spk1.kaartjesverkocht * spk1.prijs) + (h1.kaartjesverkocht * h1.prijs) + (l1.kaartjesverkocht * l1.prijs);
				System.out.println("Er is al €" + omzetKermis + " omzet gedraaid.");
				attractieOproepen();
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
				attractieOproepen();
		}
	}
}