import java.util.Scanner;

public class Tentti {

	public static void main(String[] args) {

		Scanner kayttaja = new Scanner(System.in);

		HappyOrNot happyornot = new HappyOrNot();

		int vastaus;

		System.out.println("Kirjoita 1, 2, 3 tai 4. Lopeta kirjoittamalla '0'");

		// Kysytään käyttäjältä lukuja kunnes vastaus on "0"
		do {

			System.out.println("1 :D   2 :)   3 :|   4 :(   0 exit");
			vastaus = Integer.parseInt(kayttaja.nextLine());

			if (vastaus >= 1 || vastaus <= 4) {
				happyornot.click(vastaus);
			}

		} while (vastaus != 0);

		happyornot.sammuta();

		System.out.println(Laite.getPaalla());

	}

} // Tentti-luokan loppu

class Laite {

	protected static boolean paalla;

	public static boolean getPaalla() {
		return paalla;
	}

	public void kaynnista() {
		paalla = true;
	}

	public void sammuta() {
		paalla = false;
	}
}

// Luodaan uusi luokka joka periytyy Laite-luokasta
class HappyOrNot extends Laite {

	private int valinta1;
	private int valinta2;
	private int valinta3;
	private int valinta4;

	// oletusmuodostin joka asettaa kaikkien valintojen arvoksi "0"
	public HappyOrNot()

	{
		valinta1 = 0;
		valinta2 = 0;
		valinta3 = 0;
		valinta4 = 0;
	}

	// Kasvatetaan valinnan arvoa yhdellä
	public void click(int valinta) {
		
		if (valinta == 1) {
			valinta1++;
		}

		else if (valinta == 2) {
			valinta2++;

		} else if (valinta == 3) {
			valinta3++;

		} else if (valinta == 4) {
			valinta4++;

		}
	}

	// Tulostetaan kaikkien valintojen arvot
	private void tulostaValinnat()

	{
		System.out.println(":D " + valinta1);
		System.out.println(":) " + valinta2);
		System.out.println(":| " + valinta3);
		System.out.println(":( " + valinta4);
	}

	// sammuttaa laitteen ja tulostaa kaikkien valintojen arvot
	@Override
	public void sammuta() {
		super.sammuta();
		tulostaValinnat();
	}
}
