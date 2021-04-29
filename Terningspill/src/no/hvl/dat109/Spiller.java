package no.hvl.dat109;

public class Spiller {
	
	private String navn;
	private int verdi;
	
	public Spiller(String navn) {
		this.navn = navn;
		verdi = 0;
	}
	
	public void spill(Kopp kopp) {
		kopp.trill();
		verdi = kopp.getSum();
		
	}
	
	public String toString() {
		return navn + " har rullet " + verdi;
	}

	public int getVerdi() {
		return verdi;
	}
	
	public String getNavn() {
		return navn;
	}
}
