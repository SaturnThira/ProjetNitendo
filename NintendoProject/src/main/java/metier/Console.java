package metier;

import java.time.LocalDate;

public class Console {

	private String nom;
	private int Prix;
	private LocalDate dateDeSortie;
	public Console(String nom, int prix, LocalDate dateDeSortie) {
		super();
		this.nom = nom;
		Prix = prix;
		this.dateDeSortie = dateDeSortie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return Prix;
	}
	public void setPrix(int prix) {
		Prix = prix;
	}
	public LocalDate getDateDeSortie() {
		return dateDeSortie;
	}
	public void setDateDeSortie(LocalDate dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}
	@Override
	public String toString() {
		return "Console [nom=" + nom + ", Prix=" + Prix + ", dateDeSortie=" + dateDeSortie + "]";
	}

	
	
}
