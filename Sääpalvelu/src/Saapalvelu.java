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

		System.out.println("Kirjoita päivien lämpötiloja. Kirjoita 100 kun haluat lopettaa.\n");

		//Kysytään käyttäjältä lämpötiloja kunnes käyttäjä kirjoittaa 100
		do {

			System.out.println("Kirjoita " + k + ". päivän lämpötila");
			vastaus = Double.parseDouble(kayttaja.nextLine());
			lampotilat.add(vastaus);
			k++;

		} while (vastaus != 100);

		lampotilat.remove(lampotilat.size() - 1);

		//Tulostetaan lista järjestysluvuilla
		for (int i = 0; i < lampotilat.size(); i++)

		{
			System.out.println((i + 1) + ". päivän lämpötila " + lampotilat.get(i));
			summa += lampotilat.get(i);

		}
		
		//Lasketaan lämpötilojen keskiarvo ja tulostetaan se
		keskiarvo = summa / lampotilat.size();

		System.out.println("Keskiarvo on " + keskiarvo);

		//Etsitään korkein lämpötila ja mistä indeksistä se löytyy
		double max = lampotilat.get(0);
		int maxIndex = 0;

		for (int i = 1; i < lampotilat.size(); i++) {

			if (lampotilat.get(i) > max) {
				max = lampotilat.get(i);
				maxIndex = i;
			}
		}
		
		//Tulostetaan korkeimman lämpötilan päivä sekä lämpöasteet
		System.out.println(maxIndex + 1 + ". päivänä oli lämpimintä: " + max + " astetta");

	}

}
