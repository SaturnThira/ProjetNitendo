package metier;

import java.util.List;

public class Boutique {
	
	private String nom;
	private Adresse adresseBoutique;
	
	private List<Jeu> jeux ;
	
	
	

	public Boutique(String nom, Adresse adresseBoutique, List<Jeu> jeux) {
		this.nom = nom;
		this.adresseBoutique = adresseBoutique;
		this.jeux = jeux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresseBoutique() {
		return adresseBoutique;
	}

	public void setAdresseBoutique(Adresse adresseBoutique) {
		this.adresseBoutique = adresseBoutique;
	}

	public List<Jeu> getJeux() {
		return jeux;
	}

	public void setJeux(List<Jeu> jeux) {
		this.jeux = jeux;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", adresseBoutique=" + adresseBoutique + ", jeux=" + jeux + "]";
	}
	
	

}
