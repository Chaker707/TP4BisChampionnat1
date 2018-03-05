
public class But {	
	
	private Joueur joueur;
	private int minute;
	private String maniere;  //tete, penalty, simple, coufran ......	
	
	public But(Joueur joueur, int minute, String maniere) {		
		this.joueur = joueur;
		this.minute = minute;
		this.maniere = maniere;
	}
	
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public String getManiere() {
		return maniere;
	}
	public void setManiere(String maniere) {
		this.maniere = maniere;
	}
	
	
	

}
