package metier;

import java.util.List;

public class Jeu {

	private String titre;
	private List<Console> consoles;
	private Boutique boutique;
	
	
	public Jeu(String titre, List<Console> consoles, Boutique boutique) {
		super();
		this.titre = titre;
		this.consoles = consoles;
		this.boutique = boutique;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public List<Console> getConsoles() {
		return consoles;
	}


	public void setConsoles(List<Console> consoles) {
		this.consoles = consoles;
	}


	public Boutique getBoutique() {
		return boutique;
	}


	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}


	@Override
	public String toString() {
		return "\nJeu [titre=" + titre + ", consoles=" + consoles + ", boutique=" + boutique + "]";
	}
	
	
}
	
	
	