import java.util.Scanner;

public class StaattisetMetoditHarjoitus {

	public static void main(String[] args) {
//		
//		System.out.println("Pinta-ala on: " + Laskuri.laskePintaAla(4, 6));
//		System.out.println("Ympyrän pinta-ala on: " + Laskuri.laskePintaAla(3));

		Scanner kayttaja = new Scanner(System.in);
		
		String vastaus;
		double pituus;
		double leveys;
		double sade;
		
		System.out.println("Tulostetaanko neliön vai ympyrän pinta-ala? (n/y)");
		
		vastaus = kayttaja.nextLine();
		
		if (vastaus.equals("n")) {
			
			System.out.println("Anna pituus:");
			pituus = Double.parseDouble(kayttaja.nextLine());
			
			System.out.println("Anna leveys:");
			leveys = Double.parseDouble(kayttaja.nextLine());
			
			System.out.printf("Neliön pinta-ala on: %.2f", Laskuri.laskePintaAla(pituus, leveys));
			
		} else if (vastaus.equals("y")) {
			
			System.out.println("Anna ympyrän säde:");
			sade = Double.parseDouble(kayttaja.nextLine());
			
			System.out.printf("Ympyrän pinta-ala on: %.2f", Laskuri.laskePintaAla(sade));
		} else {
			
			System.out.println("Väärä syöte!");
		}
	}

}//pääluokan loppu

class Laskuri
{
	


public static double laskePintaAla(double pituus, double leveys)
{
	double PA = pituus*leveys;
	return PA;
}
public static double laskePintaAla(double sade) 
{
	double pii = Math.PI;
	double pintaAla = pii * Math.pow(sade,2);
	
return pintaAla;
}
}
