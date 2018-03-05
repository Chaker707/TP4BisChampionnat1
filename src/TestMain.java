
public class TestMain {	

	public static void main(String[] args) {	
		
		Equipe taraji  = new Equipe("FC Taraji", "Rouge-Jaune", "Stade Rades", "Tunis", "Benzarti");
		Equipe club    = new Equipe("FC Club", "Rouge-Blanc", "Stade Rades", "Tunis", "Benzarti");
		Equipe etoile  = new Equipe("FC Etoile", "Rouge-Blanc", "Stade Sousse", "Sousse", "Benzarti");
		Equipe sfax    = new Equipe("FC Sfax", "Noir-Blanc", "Stade Sfax", "Sfax", "Benzarti");

		//// créer et ajouter 8 joueur ppour chaque equipe	
		Joueur j11=new Joueur("j11", 11, 20, "a");Joueur j12=new Joueur("j11", 12, 20, "a");Joueur j13=new Joueur("j13", 13, 20, "a");
		Joueur j14=new Joueur("j14", 14, 20, "a");Joueur j15=new Joueur("j15", 15, 20, "a");Joueur j16=new Joueur("j16", 1, 20, "a");
		taraji.addJoueur(j11);taraji.addJoueur(j12);taraji.addJoueur(j13);
		taraji.addJoueur(j14);taraji.addJoueur(j15);taraji.addJoueur(j16);
		
		Joueur j21=new Joueur("j21", 11, 20, "a");Joueur j22=new Joueur("j21", 12, 20, "a");Joueur j23=new Joueur("j13", 13, 20, "a");
		Joueur j24=new Joueur("j24", 14, 20, "a");Joueur j25=new Joueur("j25", 15, 20, "a");Joueur j26=new Joueur("j26", 1, 20, "a");
		club.addJoueur(j21);club.addJoueur(j22);club.addJoueur(j23);
		club.addJoueur(j24);club.addJoueur(j25);club.addJoueur(j26);
		
		Joueur j31=new Joueur("j31", 11, 20, "a");Joueur j32=new Joueur("j31", 12, 20, "a");Joueur j33=new Joueur("j33", 13, 20, "a");
		Joueur j34=new Joueur("j34", 14, 20, "a");Joueur j35=new Joueur("j35", 15, 20, "a");Joueur j36=new Joueur("j36", 1, 20, "a");
		etoile.addJoueur(j31);etoile.addJoueur(j32);etoile.addJoueur(j33);
		etoile.addJoueur(j34);etoile.addJoueur(j35);etoile.addJoueur(j36);
		
		Joueur j41=new Joueur("j41", 11, 20, "a");Joueur j42=new Joueur("j41", 12, 20, "a");Joueur j43=new Joueur("j43", 13, 20, "a");
		Joueur j44=new Joueur("j44", 14, 20, "a");Joueur j45=new Joueur("j45", 15, 20, "a");Joueur j46=new Joueur("j46", 1, 20, "a");
		sfax.addJoueur(j41);sfax.addJoueur(j42);sfax.addJoueur(j43);
		sfax.addJoueur(j44);sfax.addJoueur(j45);sfax.addJoueur(j46);
		
		Ligue ligue1= new Ligue();		
		ligue1.addEquipe(taraji);ligue1.addEquipe(club);
		ligue1.addEquipe(etoile);ligue1.addEquipe(sfax);
		
		Match m1= new Match("12/10/2017", 1, taraji, club, "arbitre1");
		m1.addButEquipeLocal(new But(j11, 12, "coufran"));
		m1.addButEquipeLocal(new But(j11, 30, "tete"));
		m1.addButEquipeVisiteur(new But(j21,50, "coufran"));
		
		Match m3= new Match("12/10/2017", 1, sfax, etoile, "arbitre1");
		m3.addButEquipeLocal(new But(j41, 12, "tete"));
		m3.addButEquipeLocal(new But(j42, 30, "coufran"));
		m3.addButEquipeVisiteur(new But(j31,50, "tete"));
		
		Match m4= new Match("19/10/2017", 2, sfax, club, "arbitre1");
		m4.addButEquipeLocal(new But(j41, 12, "coufran"));
		m4.addButEquipeVisiteur(new But(j24,50, "tete"));
		
		Match m2= new Match("19/10/2017", 2, taraji, etoile, "arbitre1");
		m2.addButEquipeLocal(new But(j11, 12, "tete"));
		m2.addButEquipeLocal(new But(j11, 30, "penalty"));
		m2.addButEquipeVisiteur(new But(j31,50, "tete"));		
		
		Match m5= new Match("26/10/2017", 3, sfax, taraji, "arbitre1");
		m5.addButEquipeLocal(new But(j12, 12, "tete"));
		m5.addButEquipeVisiteur(new But(j42,50, "tete"));
		
		Match m6= new Match("26/10/2017", 3, etoile, club, "arbitre1");
		m6.addButEquipeLocal(new But(j22, 12, "penalty"));
		m6.addButEquipeVisiteur(new But(j32,50, "tete"));
		
		ligue1.addMatch(m1);ligue1.addMatch(m2);
		ligue1.addMatch(m3);ligue1.addMatch(m4);
		ligue1.addMatch(m5);ligue1.addMatch(m6);
		
		
		ligue1.afficherResultatPourJournee(2);
		ligue1.classement();
		ligue1.AfficherButteurs();
		
	
		
	}

}
