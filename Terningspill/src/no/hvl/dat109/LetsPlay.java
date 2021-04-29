package no.hvl.dat109;

public class LetsPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Terningspill spill = new Terningspill();
		
		spill.leggTilSpiller("Erik");
		spill.leggTilSpiller("Maia");
		spill.leggTilSpiller("Arve");
		
		spill.spill();

	}

}
