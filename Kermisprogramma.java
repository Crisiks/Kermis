//functionaliteit toevoegen: omzet altijd met twee getallen achter de komma
//functionaliteit toevoegen: terug naar het hoofdmenu
//gebruik geen double voor de prijs, maar reken in centen en deel dit later door 100
//functionaliteit: aan het begin een uitleg
//functionaliteit toevoegen: daadwerkelijk kaartjes verkopen

package kermis;

class Kermisprogramma {

	public static void main(String[] args) {
		Kassamedewerker kassamedewerker1 = new Kassamedewerker("P.T. Barnum");
		kassamedewerker1.attractieOproepen();
	}
}