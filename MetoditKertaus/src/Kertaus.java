import java.util.Scanner;

public class Kertaus {

	public static void main(String[] args) {

		Scanner kayttaja = new Scanner(System.in);

		System.out.println("Oletko ihminen, hevonen vai koira?");

		String vastaus = kayttaja.nextLine();

		System.out.println("Paljonko on ruumiinlämpötilasi?");

		int lampo = Integer.parseInt(kayttaja.nextLine());
		
		tulostaKuumerajat();
		
		System.out.println("Laji: \n" + vastaus + "\n");
		System.out.println("Ruumiinlampo: \n" + lampo + "\n");

		if (onkoKuumetta(vastaus, lampo)==false) {

			System.out.println("Kohteella ei ole kuumetta");
		
		} else if (onkoKuumetta(vastaus, lampo)==true) {
			
			System.out.println("Kohteella on kuumetta");
		}

	} // mainin loppu

	public static void tulostaKuumerajat() {
		System.out.println("Kuumerajat:\n- ihminen 37\n- koira 39\n- hevonen 38\n");
	}

	public static boolean onkoKuumetta(String laji, int lampotila) {
		
		boolean kuumetta = false;

		if (laji.equals("ihminen") && lampotila > 37) {

			kuumetta = true;

		} else if (laji.equals("koira") && lampotila > 39) {

			kuumetta = true;
			
		} else if (laji.equals("hevonen") && lampotila > 38) {

			kuumetta = true;
		}

		return kuumetta;

	}
}
