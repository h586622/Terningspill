package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

public class Terningspill {
	
	private int id;
	private Kopp kopp;
	private List<Spiller> spillere;
	

	public Terningspill() {
		kopp = new Kopp();
		spillere = new ArrayList<Spiller>();
		
	}
	
	public void leggTilSpiller(String navn) {
		
		Spiller ny = new Spiller(navn);
		spillere.add(ny);
	}
	
	public void spill() {
		for (Spiller s : spillere) {
			s.spill(kopp);
			System.out.println(s.toString());
		}
		int hoyeste = 0;
		Spiller vinner = null;
		for (Spiller s : spillere) {
			if(s.getVerdi() > hoyeste) {
				hoyeste = s.getVerdi();
				vinner = s;
			}			
		}
		System.out.println("Vinneren er " + vinner.getNavn());
	}
}
