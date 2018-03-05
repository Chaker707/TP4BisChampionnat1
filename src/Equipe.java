import java.util.ArrayList;
import java.util.List;

public class Equipe {
	
	private String nomEquipe;
	private String couleurEquipe;
	private String stadeEquipe;
	private String villeEquipe;
	private List<Joueur> listeJoueurs;
	private String entraineur;
		
	public Equipe(String nomEquipe, String couleurEquipe, String stadeEquipe, String villeEquipe,String entraineur) {
		this.nomEquipe = nomEquipe;
		this.couleurEquipe = couleurEquipe;
		this.stadeEquipe = stadeEquipe;
		this.villeEquipe = villeEquipe;
		this.listeJoueurs = new ArrayList<>();
		this.entraineur = entraineur;
	}
	
	public void addJoueur(Joueur j){
		this.listeJoueurs.add(j);
	}
	
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	public String getCouleurEquipe() {
		return couleurEquipe;
	}
	public void setCouleurEquipe(String couleurEquipe) {
		this.couleurEquipe = couleurEquipe;
	}
	public String getStadeEquipe() {
		return stadeEquipe;
	}
	public void setStadeEquipe(String stadeEquipe) {
		this.stadeEquipe = stadeEquipe;
	}
	public String getVilleEquipe() {
		return villeEquipe;
	}
	public void setVilleEquipe(String villeEquipe) {
		this.villeEquipe = villeEquipe;
	}
	public List<Joueur> getListeJoueurs() {
		return listeJoueurs;
	}
	public void setListeJoueurs(List<Joueur> listeJoueurs) {
		this.listeJoueurs = listeJoueurs;
	}
	public String getEntraineur() {
		return entraineur;
	}
	public void setEntraineur(String entraineur) {
		this.entraineur = entraineur;
	}

	
	
	
	
	
}
