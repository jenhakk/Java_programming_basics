import java.util.ArrayList;
import java.util.Scanner;

public class Saapalvelu {

	public static void main(String[] args) {

		Scanner kayttaja = new Scanner(System.in);

		ArrayList<Double> lampotilat = new ArrayList<Double>();

		double vastaus;
		int k = 1;
		double keskiarvo;
		double summa = 0;

		System.out.println("Kirjoita p�ivien l�mp�tiloja. Kirjoita 100 kun haluat lopettaa.\n");

		//Kysyt��n k�ytt�j�lt� l�mp�tiloja kunnes k�ytt�j� kirjoittaa 100
		do {

			System.out.println("Kirjoita " + k + ". p�iv�n l�mp�tila");
			vastaus = Double.parseDouble(kayttaja.nextLine());
			lampotilat.add(vastaus);
			k++;

		} while (vastaus != 100);

		lampotilat.remove(lampotilat.size() - 1);

		//Tulostetaan lista j�rjestysluvuilla
		for (int i = 0; i < lampotilat.size(); i++)

		{
			System.out.println((i + 1) + ". p�iv�n l�mp�tila " + lampotilat.get(i));
			summa += lampotilat.get(i);

		}
		
		//Lasketaan l�mp�tilojen keskiarvo ja tulostetaan se
		keskiarvo = summa / lampotilat.size();

		System.out.println("Keskiarvo on " + keskiarvo);

		//Etsit��n korkein l�mp�tila ja mist� indeksist� se l�ytyy
		double max = lampotilat.get(0);
		int maxIndex = 0;

		for (int i = 1; i < lampotilat.size(); i++) {

			if (lampotilat.get(i) > max) {
				max = lampotilat.get(i);
				maxIndex = i;
			}
		}
		
		//Tulostetaan korkeimman l�mp�tilan p�iv� sek� l�mp�asteet
		System.out.println(maxIndex + 1 + ". p�iv�n� oli l�mpimint�: " + max + " astetta");

	}

}
