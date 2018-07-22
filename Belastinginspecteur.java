package kermis;

public class Belastinginspecteur {
	double [] bedragVoorBelasting = new double[1];
	int [] aantalBezoekenVanInspecteur = new int[1];
	
	void belastingOphalen(GokAttractie g1, double[] omzetKermis) {
		System.out.println("Het volledige bedrag dat door de inspecteur wordt opgehaald is " + g1.belastinguitomzet[0]/100 + ".");
		omzetKermis[0] = omzetKermis[0] - g1.belastinguitomzet[0];
		bedragVoorBelasting[0] = bedragVoorBelasting[0] + g1.belastinguitomzet[0];
		g1.belastinguitomzet[0] = 0;
		System.out.println(g1.belastinguitomzet[0]);
		aantalBezoekenVanInspecteur[0]++;
		System.out.println("De belastinginspecteur is al " + aantalBezoekenVanInspecteur[0] + " keer langsgeweest en heeft in totaal al €" + bedragVoorBelasting[0]/100 + " opgehaald.");
	}
}