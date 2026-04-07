

import java.util.*;

/**
 * CLASSE A PRODUIRE PAR LES ETUDIANTS
 * 
 * La classe Telecommande permet de manipuler une liste de Lampe. Elle sera
 * amenee a commander une liste d'appareil plus generiques par la suite.
 * 
 * on peut rajouter des get avec un entier en parametre pour permettre les tests
 * mais pas de set.
 * 
 */
public class Telecommande {

	/**
	 * la liste des lampes a controler on utilise l'interface pour masquer
	 * l'implementation a ce niveau
	 */
	private List<Lampe> lampes;

	/**
	 * construit une telecommande sans lampe
	 */
	public Telecommande() {
		this.lampes = new ArrayList<Lampe>();
	}

	/**
	 * on ajoute une lampe a la liste des lampes controlees
	 * 
	 * @param nouvelleLampe
	 *            nouvelle lampe a controler
	 */
	public void ajouterLampe(Lampe nouvelleLampe) {
		this.lampes.add(nouvelleLampe);
	}

	/**
	 * permet d'activer une lampe a partir de la telecommande
	 * 
	 * @param indiceLampe
	 *            indice de la lampe a activer dans la telecommande
	 */
	public void activerLampe(int indiceLampe) {
		// TODO les etudiants devraient verifier qu'on ne deborde pas du tableau
		// dans leurs tests
		if (indiceLampe < this.lampes.size())
			this.lampes.get(indiceLampe).allumer();
	}

	/**
	 * permet de desactiver une lampe en utilisant la telecommande
	 * 
	 * @param indiceLampe
	 *            indice de la lampe a eteindre
	 */
	public void desactiverLampe(int indiceLampe) {
		if (indiceLampe < this.lampes.size())
			this.lampes.get(indiceLampe).eteindre();
	}

	/**
	 * permet d'activer l'ensemble des lampes
	 */
	public void activerTout() {
		for (int i = 0; i < this.lampes.size(); i++)
			// reutiliser du code existant
			this.activerLampe(i);
	}

	/**
	 * descriptif de la telecommande retourne une ligne par lampe suivi du
	 * status de la lampe.
	 */
	public String toString() {
		String descriptif = "";
		for (int i = 0; i < this.lampes.size(); i++) {
			descriptif += i + "-" + this.lampes.get(i) + "\n";
		}
		return (descriptif);
	}

	/**
	 * get qui retourne une lampe utile pour les tests
	 * 
	 * @param indiceLampe
	 *            indice de la lampe a tester
	 * @return la lampe a l'indice indiceLampe
	 */
	public Lampe getLampe(int indiceLampe) {
		if (indiceLampe < this.lampes.size())
			return (this.lampes.get(indiceLampe));
		else
			return(null);
	}

}
