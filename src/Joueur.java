
public class Joueur {
	
	private String nomJoueur;
	private int numJoueur;    
	private int ageJoueur;
	private String posteJoueur;
	
	public Joueur(String nomJoueur, int numJoueur, int ageJoueur, String posteJoueur) {
		this.nomJoueur = nomJoueur;
		this.numJoueur = numJoueur;
		this.ageJoueur = ageJoueur;
		this.posteJoueur = posteJoueur;
	}
	public String getNomJoueur() {
		return nomJoueur;
	}
	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}
	public int getNumJoueur() {
		return numJoueur;
	}
	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
	}
	public int getAgeJoueur() {
		return ageJoueur;
	}
	public void setAgeJoueur(int ageJoueur) {
		this.ageJoueur = ageJoueur;
	}
	public String getPosteJoueur() {
		return posteJoueur;
	}
	public void setPosteJoueur(String posteJoueur) {
		this.posteJoueur = posteJoueur;
	}
	

	
}
