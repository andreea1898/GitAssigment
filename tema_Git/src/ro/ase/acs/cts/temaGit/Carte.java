package ro.ase.acs.cts.temaGit;

public class Carte implements IReducereCarte {
	private int id;
	private String isbn;
	private String editura;
	private float pret;
		
	public Carte(int id, String isbn, String editura, float pret) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.editura = editura;
		this.pret = pret;
	}

	@Override
	public float getReducere(float procentReducere) {
		return  pret*procentReducere;
	}
}
