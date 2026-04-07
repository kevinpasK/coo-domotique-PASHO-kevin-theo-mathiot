import java.util.Scanner;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main {

	/**
	 * creation des objets et ajout dans la telecommande
	 * 
	 * @param t
	 *            telecommande dans lequelle on ajoute 4 lampes
	 */
	private static void main(Telecommande t) {
		Lampe l1 = new Lampe("Lampe1");
		t.ajouterLampe(l1);

		Lampe l2 = new Lampe("Lampe2");
		t.ajouterLampe(l2);

		Lampe l3 = new Lampe("Lampe3");
		t.ajouterLampe(l3);

		Lampe l4 = new Lampe("Lampe4");
		t.ajouterLampe(l4);

		Hifi h1  = new Hifi();

		Cheminee c1 = new Cheminee();

		AdapterCheminee a1 = new AdapterCheminee(c1);

		t.ajouterAppareil()
	}

}
