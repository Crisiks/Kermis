//functionaliteit toevoegen: omzet altijd met twee getallen achter de komma
//gebruik geen double voor de prijs, maar reken in centen en deel dit later door 100
//functionaliteit toevoegen: daadwerkelijk kaartjes verkopen
//functionaliteit: [o]omzet naar [o]mzet

package kermis;

class Kermisprogramma {

	public static void main(String[] args) throws Exception {
		Kassa kassa1 = new Kassa();
		kassa1.attractieOproepen(kassa1);
	}
}