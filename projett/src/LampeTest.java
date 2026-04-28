import static org.junit.jupiter.api.Assertions.*;

/**
 * classe de test permettant de tester la classe Lampe
 */
public class LampeTest {
	/**
	 * test du constructeur de lampe
	 */
	public void testLampe() {
		// methode testee
		Lampe l = new Lampe("lampe1");

		// verification
		boolean res = l.isAllume();
		assertEquals("une nouvelle lampe devrait etre eteinte", false, res);
	}


	/**
	 * test allumer une lampe eteinte
	 */
	public void testAllumer() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		
		//methode testee
		l.allumer();

		// verification
		boolean res = l.isAllume();
		assertEquals("apres allumer, la lampe devrait etre allumee", true, res);
	}
	

	/**
	 * test allumer une lampe allumee
	 */
	public void testAllumer_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();
		
		//methode testee
		l.allumer();

		// verification
		boolean res = l.isAllume();
		assertEquals("apres allumer, la lampe devrait etre allumee", true, res);
	}


	/**
	 * test eteindre une lampe allumee
	 */
	public void testeteindre_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();
		
		//methode testee
		l.eteindre();

		// verification
		boolean res = l.isAllume();
		assertEquals("apres eteindre, la lampe devrait etre eteinte", false, res);
	}
	

	/**
	 * test to String lampe eteinte
	 */
	public void testToString_eteinte() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		
		//methode testee
		String r=""+l;
		
		//verification
		assertEquals("affichage devrait etr off","lampe1: Off",r);
	}
	

	/**
	 * test to String lampe allumee
	 */
	public void testToString_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();
		
		//methode testee
		String r=""+l;
		
		//verification
		assertEquals("affichage devrait etr off","lampe1: On",r);

	}

}
