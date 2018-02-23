package exemplu;

public class Persoana {
	private int nr;
	private String nume;
	private int varsta;
	public Persoana(int nr, String nume, int varsta) {
		super();
		this.nr = nr;
		this.nume = nume;
		this.varsta = varsta;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	@Override
	public String toString() {
		return "Persoana [nr=" + nr + ", nume=" + nume + ", varsta=" + varsta + "]";
	}
	
	
}
