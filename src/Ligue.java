import java.util.Vector;

public class Ligue {

	private Vector<Equipe> equipes;
	private Vector<Match>  matches;
	
	public Ligue() {
		this.equipes = new Vector<>();
		this.matches = new Vector<>();
	}	
	public void addEquipe (Equipe e1){
		this.equipes.add(e1);
	}	
	public void addMatch(Match m1){
		this.matches.add(m1);
	}
	

	//// methodes � ajouter
	//// Afficher les r�sultats pour une journ�e donn�e
	//// Afficher le classement des equipes en d�tail
	//// Afficher le classement des butteurs
	//// Afficher liste des matches d'une equipe donn�e

	public void afficherResultatPourJournee(int journee){
		System.out.println("Liste des matches pour la journ�e "+journee);
		for(Match m:matches){
			if(m.getNumJournee()==journee)
			System.out.println(m.getEquipeLocal().getNomEquipe()+" "+m.getListeButEquipeLocal().size()+":"+m.getListeButEquipeVisiteur().size()+" "+m.getEquipeVisiteur().getNomEquipe());
			
		}
	}
	
	//// methode de calcul de nombre des point pour chaque equipe
	public int nbrePointParEquipe(Equipe eq){
		int nb=0;
		for(Match m:matches){
			if(m.getEquipeLocal().getNomEquipe().equals(eq.getNomEquipe())){
				if(m.getListeButEquipeLocal().size()>m.getListeButEquipeVisiteur().size()){
					nb+=3;
				}
				if(m.getListeButEquipeLocal().size()==m.getListeButEquipeVisiteur().size()){
					nb+=1;
				}
			}
			if(m.getEquipeVisiteur().getNomEquipe().equals(eq.getNomEquipe())){
				if(m.getListeButEquipeLocal().size()<m.getListeButEquipeVisiteur().size()){
					nb+=3;
				}
				if(m.getListeButEquipeLocal().size()==m.getListeButEquipeVisiteur().size()){
					nb+=1;
				}
			}			
		}
		return nb;
	}
	
	
	public void classement(){		
		for(int i=0;i<equipes.size();i++){		
			for(int j=i+1;j<equipes.size();j++){
				if(nbrePointParEquipe(equipes.get(j))>=nbrePointParEquipe(equipes.get(i))){					
					Equipe e=equipes.get(i);
					equipes.set(i, equipes.get(j));
					equipes.set(j, e);
				}
		    }			
		}		
		System.out.println("Classement des equipes ");	
		for(Equipe e:equipes){
			System.out.println(e.getNomEquipe()+" => "+this.nbrePointParEquipe(e));	
		}		
	}
	
	/// Calculer le nombre des buts pour un joueur donn�e
	public int nbreButPourJoueur(Joueur j){
		int nb=0;
		for(Match m:matches){
			for(But b1:m.getListeButEquipeLocal()){
				if(b1.getJoueur().getNomJoueur().equals(j.getNomJoueur()))
					nb++;
			}
			for(But b1:m.getListeButEquipeVisiteur()){
				if(b1.getJoueur().getNomJoueur().equals(j.getNomJoueur()))
					nb++;
			}
		}
		return nb;
	}
	
	
	public boolean existeJoueur(Joueur j, Vector<Joueur> liste){
		boolean test=false;		
		for(Joueur j1 : liste){
			if(j1.getNomJoueur().equals(j.getNomJoueur()))
				test=true;
		}
		return test;
	}
	
	//// Afficher la liste des buteurs tri�s
	public void AfficherButteurs(){
		Vector<Joueur> liste= new Vector<>();			
		for(Equipe e:equipes){
			for(Joueur j:e.getListeJoueurs())
				if((nbreButPourJoueur(j)>0) && (!existeJoueur(j,liste)))
					liste.add(j);
		}
		/// trier la liste 
		for(int i=0;i<liste.size();i++){
			for(int j=i+1;i<liste.size();i++){
				if(nbreButPourJoueur(liste.get(j))>nbreButPourJoueur(liste.get(i))){
					Joueur j1=liste.get(i);
					liste.set(i, liste.get(j));
					liste.set(j, j1);
				}
			}			
		}
		/// affichage de la liste
		System.out.println("Liste des butteurs");
		for(Joueur j:liste){
			System.out.println(j.getNomJoueur()+" => "+nbreButPourJoueur(j));
		}
		
	}
	
	
	//// Afficher liste des matches jouer dans la composition prinipale pour un joueur donn�e
	//// Afficher liste des matches comme rempla�ant pour un joueur donn�e	
	///  modifier les classes n�cessaires pour g�rer les cartes jaunes et rouges.  
	//// fin 
	
	
	
	public Vector<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(Vector<Equipe> equipes) {
		this.equipes = equipes;
	}
	public Vector<Match> getMatches() {
		return matches;
	}
	public void setMatches(Vector<Match> matches) {
		this.matches = matches;
	}
	
	
	
}
