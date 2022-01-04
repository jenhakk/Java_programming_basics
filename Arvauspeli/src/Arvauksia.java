import java.util.Scanner;

public class Arvauksia {

	public static void main(String[] args) {
		
		Scanner pelaaja = new Scanner(System.in);
		
		//Tehd��n peli jossa pelaaja yrittää arvata nimen oikein
		
		//Alustetaan nimi jota haetaan ja kysytään pelaajalta nimeä
		
		
		String arvaus;
		int arvausKerrat = 0;
		
		// Aloita arvuuttamalla nime� ja tallenna arvaus
		
		System.out.println("Arvaa oikea nimi");
		System.out.println("Kirjoita 'loppu' kun haluat lopettaa pelin.");
		arvaus = pelaaja.nextLine();
		
		//Kysele nimeä kunnes pelaaja vastaa "olli" tai "loppu"
		do {
		
			//Jos arvaus on oikein, tulosteaan "Arvasit oikein!" ja peli loppuu
			//Lisätään yksi arvauskerta
			
		if (arvaus.equalsIgnoreCase("olli"))
			
			{ System.out.println("Arvasit oikein! :)");
			arvausKerrat++;
			break;
			}	
		
			//Jos pelaaja kirjoittaa "loppu", tulostetaan Game over ja peli loppuu
			if (arvaus.equalsIgnoreCase("loppu"))
			
			{ System.out.println("Game over");
			break;
			}
			
			//Muuten tulostetaan "Arvaa uudelleen ja lis�t��n 1 arvauskerta
		else {
		System.out.println("Arvaa uudelleen");
		arvaus = pelaaja.nextLine();
		arvausKerrat++;
		
			//Arvaus oikein, peli loppuu ja lis�t��n 1 arvauskerta
			
		if (arvaus.equalsIgnoreCase("olli"))
			
				{ System.out.println("Arvasit oikein! :)");
				arvausKerrat++;
				break;
				}	
		//Jos pelaaja kirjoittaa "loppu", tulostetaan Game over ja peli loppuu
		else if (arvaus.equalsIgnoreCase("loppu"))
			
				{ System.out.println("Game over");
				break;
				}		
		
		}
			//Jatketaan mikäli arvaus ei ole "olli"
		} while (!arvaus.equals("olli"));
			
		//Tulostetaan lopuksi arvauskertojen määrä
		System.out.println("Arvauskertoja oli " + arvausKerrat);	
	}
}
	
