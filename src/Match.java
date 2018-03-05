import java.util.ArrayList;
import java.util.List;

public class Match {
	
	private String dateMatch;
	private int numJournee;
	private Equipe equipeLocal;
	private Equipe equipeVisiteur;	
	private String arbitrePrincipal;
	private List<Joueur> compositionEquipeLocal;
	private List<Joueur> compositionEquipeVisiteur;
	private List<Joueur> remplacantsEquipeLocal;
	private List<Joueur> remplacantsEquipeVisiteur;
	private List<But> listeButEquipeLocal;
	private List<But> listeButEquipeVisiteur;
	
	public Match(String dateMatch, int numJournee, Equipe equipeLocal, Equipe equipeVisiteur, String arbitrePrincipal) {
		this.dateMatch = dateMatch;
		this.numJournee = numJournee;
		this.equipeLocal = equipeLocal;
		this.equipeVisiteur = equipeVisiteur;
		this.arbitrePrincipal = arbitrePrincipal;
		this.compositionEquipeLocal = new ArrayList<>();;
		this.compositionEquipeVisiteur = new ArrayList<>();;
		this.remplacantsEquipeLocal = new ArrayList<>();;
		this.remplacantsEquipeVisiteur = new ArrayList<>();;
		this.listeButEquipeLocal = new ArrayList<>();;
		this.listeButEquipeVisiteur = new ArrayList<>();;
	}	
	
	public void addJoueurCompositionEquipeLocal(Joueur j){
		this.compositionEquipeLocal.add(j);
	}
	public void addJoueurCompositionEquipeVisiteur(Joueur j){
		this.compositionEquipeVisiteur.add(j);
	}
	public void addJoueurRemplacantsEquipeLocal(Joueur j){
		this.remplacantsEquipeLocal.add(j);
	}
	public void addJoueurRemplacantsEquipeVisiteur(Joueur j){
		this.remplacantsEquipeVisiteur.add(j);
	}
	public void addButEquipeLocal(But b){
		this.listeButEquipeLocal.add(b);
	}
	public void addButEquipeVisiteur(But b){
		this.listeButEquipeVisiteur.add(b);
	}
	
	
	
	public String getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(String dateMatch) {
		this.dateMatch = dateMatch;
	}

	public int getNumJournee() {
		return numJournee;
	}

	public void setNumJournee(int numJournee) {
		this.numJournee = numJournee;
	}

	public Equipe getEquipeLocal() {
		return equipeLocal;
	}

	public void setEquipeLocal(Equipe equipeLocal) {
		this.equipeLocal = equipeLocal;
	}

	public Equipe getEquipeVisiteur() {
		return equipeVisiteur;
	}

	public void setEquipeVisiteur(Equipe equipeVisiteur) {
		this.equipeVisiteur = equipeVisiteur;
	}

	public String getArbitrePrincipal() {
		return arbitrePrincipal;
	}

	public void setArbitrePrincipal(String arbitrePrincipal) {
		this.arbitrePrincipal = arbitrePrincipal;
	}

	public List<Joueur> getCompositionEquipeLocal() {
		return compositionEquipeLocal;
	}

	public void setCompositionEquipeLocal(List<Joueur> compositionEquipeLocal) {
		this.compositionEquipeLocal = compositionEquipeLocal;
	}

	public List<Joueur> getCompositionEquipeVisiteur() {
		return compositionEquipeVisiteur;
	}

	public void setCompositionEquipeVisiteur(List<Joueur> compositionEquipeVisiteur) {
		this.compositionEquipeVisiteur = compositionEquipeVisiteur;
	}

	public List<Joueur> getRemplacantsEquipeLocal() {
		return remplacantsEquipeLocal;
	}

	public void setRemplacantsEquipeLocal(List<Joueur> remplacantsEquipeLocal) {
		this.remplacantsEquipeLocal = remplacantsEquipeLocal;
	}

	public List<Joueur> getRemplacantsEquipeVisiteur() {
		return remplacantsEquipeVisiteur;
	}

	public void setRemplacantsEquipeVisiteur(List<Joueur> remplacantsEquipeVisiteur) {
		this.remplacantsEquipeVisiteur = remplacantsEquipeVisiteur;
	}

	public List<But> getListeButEquipeLocal() {
		return listeButEquipeLocal;
	}

	public void setListeButEquipeLocal(List<But> listeButEquipeLocal) {
		this.listeButEquipeLocal = listeButEquipeLocal;
	}

	public List<But> getListeButEquipeVisiteur() {
		return listeButEquipeVisiteur;
	}

	public void setListeButEquipeVisiteur(List<But> listeButEquipeVisiteur) {
		this.listeButEquipeVisiteur = listeButEquipeVisiteur;
	}
	
	
	
	
	
}
