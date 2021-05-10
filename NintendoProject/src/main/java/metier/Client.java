package metier;

import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	List<Achat> ListedeJeux;
	
	public Client(String nom, String prenom, List<Achat> listedeJeux) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		ListedeJeux = listedeJeux;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Achat> getListedeJeux() {
		return ListedeJeux;
	}
	public void setListedeJeux(List<Achat> listedeJeux) {
		ListedeJeux = listedeJeux;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", ListedeJeux=" + ListedeJeux + "]";
	}

	
	
}
