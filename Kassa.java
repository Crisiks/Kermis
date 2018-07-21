package kermis;

import java.util.Scanner;

public class Kassa {
	Scanner scanner = new Scanner(System.in);
	Botsautos b1 = new Botsautos("2Fast2Furious: Overdrive", 2.50, 100, 0);
	Spin sp1 = new Spin("TwistR", 2.25, 75, 0);
	Spiegelpaleis spp1 = new Spiegelpaleis("DoppleGangLand", 2.25, 75, 0);
	Spookhuis spk1 = new Spookhuis("Haunted House on the Hill: the Reckoning", 3.20, 125, 0);
	Hawaii h1 = new Hawaii("Apollo 13: Deep Impact", 2.90, 20, 0);
	Ladderklimmen l1 = new Ladderklimmen("Summit: the Mount Everest experience", 5.00, 3, 0);
	
	void attractieOproepen(Kassa kassa1) {	
		System.out.println("Wat wil je oproepen?" + "\n" + "[1]Botsautos, [2]Spin, [3]Spiegelpaleis, [4]Spookhuis," + "\n" + "[5]Hawaii, [6]Ladderklimmen, [7]Kermis als geheel.");
		int gekozenNummer = scanner.nextInt();
		System.out.println(gekozenNummer);
		switch (gekozenNummer) {
			case 1:
				b1.botsautosOproepen(b1, kassa1);
				break;
			case 2:
				sp1.spinOproepen(sp1, kassa1);
				break;
			case 3:
				spp1.spiegelpaleisOproepen(spp1, kassa1);
				break;
			case 4:
				spk1.spookhuisOproepen(spk1, kassa1);
				break;
			case 5:
				h1.hawaiiOproepen(h1, kassa1);
				break;
			case 6:
				l1.ladderklimmenOproepen(l1, kassa1);
				break;
			case 7:
				kermisOproepen(kassa1, b1, sp1, spp1, spk1, h1, l1);
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");		
		}
	}
	
	void kermisOproepen(Kassa kassa1, Botsautos b1, Spin sp1, Spiegelpaleis spp1, Spookhuis spk1, Hawaii h1, Ladderklimmen l1) {
		System.out.println("De kermis draait overuren! Wat wil je weten?" + "\n" + "[k]:totale aantal kaartjes verkocht, [o]totale omzet, [t] terug naar hoofdmenu.");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'k':
				int[] totaalAantalKaartjes = new int[1];
				totaalAantalKaartjes[1] = b1.kaartjesverkocht[0] + sp1.kaartjesverkocht[0] + spp1.kaartjesverkocht[0] + spk1.kaartjesverkocht[0] + h1.kaartjesverkocht[0] + l1.kaartjesverkocht[0]; 
				System.out.println("Er zijn al " + totaalAantalKaartjes + " kaartjes verkocht.");
				attractieOproepen(kassa1);
				break;
			case 'o':
				double omzetKermis = (b1.kaartjesverkocht[0] * b1.prijs) + (sp1.kaartjesverkocht[0] * sp1.prijs) + (spp1.kaartjesverkocht[0] * spp1.prijs) + (spk1.kaartjesverkocht[0] * spk1.prijs) + (h1.kaartjesverkocht[0] * h1.prijs) + (l1.kaartjesverkocht[0] * l1.prijs);
				System.out.println("Er is al �" + omzetKermis + " omzet gedraaid.");
				attractieOproepen(kassa1);
				break;
			case 't': 
				attractieOproepen(kassa1);
			default:
				System.out.println("Dat is geen geldige keuze.");
				attractieOproepen(kassa1);
		}
	}
}