

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
	private List<Appareil> appareils;

	/**
	 * construit une telecommande sans lampe
	 */
	public Telecommande() {
		this.appareils = new ArrayList<Appareil>();
	}

	/**
	 * on ajoute une lampe a la liste des lampes controlees
	 * 
	 * @param nouvelleLampe
	 *            nouvelle lampe a controler
	 */
	public void ajouterAppareil (Appareil nouvelleAppareil) {
		this.appareils.add(nouvelleAppareil);
	}

	/**
	 * permet d'activer une lampe a partir de la telecommande
	 * 
	 * @param indiceLampe
	 *            indice de la lampe a activer dans la telecommande
	 */
	public void activerAppareil(int indiceAppareil) {
		// TODO les etudiants devraient verifier qu'on ne deborde pas du tableau
		// dans leurs tests
		if (indiceAppareil < this.appareils.size())
			this.appareils.get(indiceAppareil).allumer();
	}

	/**
	 * permet de desactiver une lampe en utilisant la telecommande
	 * 
	 * @param indiceLampe
	 *            indice de la lampe a eteindre
	 */
	public void desactiverAppareil(int indiceAppareil) {
		if (indiceAppareil < this.appareils.size())
			this.appareils.get(indiceAppareil).eteindre();
	}

	/**
	 * permet d'activer l'ensemble des lampes
	 */
	public void activerTout() {
		for (int i = 0; i < this.appareils.size(); i++)
			// reutiliser du code existant
			this.activerAppareil(i);
	}

	/**
	 * descriptif de la telecommande retourne une ligne par lampe suivi du
	 * status de la lampe.
	 */
	public String toString() {
		String descriptif = "";
		for (int i = 0; i < this.appareils.size(); i++) {
			descriptif += i + "-" + this.appareils.get(i) + "\n";
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
	public Appareil getAppareil(int indiceAppareil) {
		if (indiceAppareil < this.appareils.size())
			return (this.appareils.get(indiceAppareil));
		else
			return(null);
	}

}
