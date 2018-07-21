package kermis;

import java.util.Scanner;

public abstract class Attractie {
	Scanner scanner = new Scanner(System.in);
	
	String naam;
	double prijs;
	int oppervlakte;
	int [] kaartjesverkocht = new int[1];
}