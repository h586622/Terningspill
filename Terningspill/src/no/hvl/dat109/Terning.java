package no.hvl.dat109;

public class Terning {
	
	private int verdi;
	private int id;
	
	public Terning(int id) {
		verdi = 0;
		this.id=id;
	}
	
	public void trill() {
		verdi = (int) (Math.random()*6) +1;
	}
	
	public int getVerdi() {
		return verdi;
	}
	
	public int getId() {
		return id;
	}

}
