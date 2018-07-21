package kermis;

public interface GokAttractie {
	double [] belastinguitomzet = new double[1];
	
	public default void kansSpelBelastingBetalen(GokAttractie g1, double[] ladderklimmenOmzet, Belastinginspecteur bi1) { //Dit moet een default zijn van eclipse, als static werkt het niet. Maar waarom?
		belastinguitomzet[0] = (ladderklimmenOmzet[0] * 0.3) - bi1.bedragVoorBelasting[0];
		//System.out.println(belastinguitomzet[0]);
	}
}