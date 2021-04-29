package no.hvl.dat109;

public class Kopp {
	
	private int id;
	private int sum;
	private Terning t1;
	private Terning t2;
	
	public Kopp() {
		t1 = new Terning(1);
		t2 = new Terning(2);
		sum = 0;
		
	}
	
	public void trill() {
		t1.trill();  t2.trill();
		sum = t1.getVerdi() + t2.getVerdi();
	}

	public int getSum() {
		return sum;
	}
}
