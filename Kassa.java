package kermis;

import java.util.Scanner;

public class Kassa {
	Scanner scanner = new Scanner(System.in);
	Botsautos b1 = new Botsautos("2Fast2Furious: Overdrive", 250, 100, 0);
	Spin sp1 = new Spin("TwistR", 225, 75, 0, 5);
	Spiegelpaleis spp1 = new Spiegelpaleis("DoppleGangLand", 225, 75, 0);
	Spookhuis spk1 = new Spookhuis("Haunted House on the Hill: the Reckoning", 320, 125, 0);
	Hawaii h1 = new Hawaii("Apollo 13: Deep Impact", 290, 20, 0, 10);
	Ladderklimmen l1 = new Ladderklimmen("Summit: the Mount Everest experience", 500, 3, 0);
	Belastinginspecteur bi1 = new Belastinginspecteur();
	
	void attractieOproepen(Kassa kassa1) throws Exception {	
		System.out.println("Wat wil je oproepen?" + "\n" + "[1]Botsautos, [2]Spin, [3]Spiegelpaleis, [4]Spookhuis," + "\n" + "[5]Hawaii, [6]Ladderklimmen, [7]Kermis als geheel.");
		int gekozenNummer = scanner.nextInt();
		//System.out.println(gekozenNummer);
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
				l1.ladderklimmenOproepen(l1, kassa1, bi1);
				break;
			case 7:
				kermisOproepen(kassa1, b1, sp1, spp1, spk1, h1, l1, bi1);
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
				attractieOproepen(kassa1);
		}
	}
	
	void kermisOproepen(Kassa kassa1, Botsautos b1, Spin sp1, Spiegelpaleis spp1, Spookhuis spk1, Hawaii h1, Ladderklimmen l1, Belastinginspecteur bi1) throws Exception {
		System.out.println("De kermis draait overuren! Wat wil je doen?" + "\n" + "aantal [k]aartjes verkocht zien, totale [o]mzet zien, [b]elastinginspectie aanroepen, [t]erug naar hoofdmenu.");
		char c = scanner.next().charAt(0);
		double[] omzetKermis = new double [1];
		omzetKermis[0] = (b1.kaartjesverkocht[0] * b1.prijs) + (sp1.kaartjesverkocht[0] * sp1.prijs) + (spp1.kaartjesverkocht[0] * spp1.prijs) + (spk1.kaartjesverkocht[0] * spk1.prijs) + (h1.kaartjesverkocht[0] * h1.prijs) + l1.omzetLadderklimmen[0] - bi1.bedragVoorBelasting[0];
		switch (c) {
			case 'k':
				int[] totaalAantalKaartjes = new int[1];
				totaalAantalKaartjes[0] = b1.kaartjesverkocht[0] + sp1.kaartjesverkocht[0] + spp1.kaartjesverkocht[0] + spk1.kaartjesverkocht[0] + h1.kaartjesverkocht[0] + l1.kaartjesverkocht[0]; 
				System.out.println("Er zijn al " + totaalAantalKaartjes[0] + " kaartjes verkocht.");
				attractieOproepen(kassa1);
				break;
			case 'o':
				System.out.println("Er is al €" + omzetKermis[0]/100 + " omzet gedraaid." + "\n" + "Hiervan is €" + l1.belastinguitomzet[0]/100 + " gereserveerd voor de belasting.");
				attractieOproepen(kassa1);
				break;
			case 'b':
				bi1.belastingOphalen(l1, omzetKermis);
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