package ro.ase.acs.cts.temaGit;

public class TestGit {
	public static void main(String[] args) {
		System.out.println("Hello Git! Badea Andreea Aplicatie web pentru gestiunea unei librarii online");
		Carte c=new Carte(1,"9786060360049","Puterea umbrei",35.7f);
		c.getReducere(0.2f);
		System.out.println(c.getReducere(0.2f));
		
		
	}

}
