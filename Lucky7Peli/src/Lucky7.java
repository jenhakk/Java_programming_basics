import java.util.Random;
import java.util.Scanner;

public class Lucky7 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner pelaaja = new Scanner(System.in);

		
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;	
		String vastaus;
		
		
		
		System.out.println("Tervetuloa pelaamaan! Mikä summa laitetaan saldoksi?");
		
		int saldo = Integer.valueOf(pelaaja.nextLine());
		
		if (saldo <= 0) {
			System.out.println("Väärä vastaus! Yritä uudelleen!");
			
			saldo = Integer.valueOf(pelaaja.nextLine());	
			System.out.println("Sinulla on saldoa " + saldo + " euroa\n");
		}
		do {
			if (saldo < 1) {
				
				System.out.println("Game over! Rahat loppuivat!");
			}
		
		
			
			randomNumber1 = random.nextInt(10)+1;
			randomNumber2 = random.nextInt(10)+1;
			randomNumber3 = random.nextInt(10)+1;
			
		// Arvotaan kolme numeroa
		System.out.println("Arvotaan kolme numeroa.");
		System.out.println("Ensimmäinen numero: " + randomNumber1);
		System.out.println("Toinen numero: " + randomNumber2);
		System.out.println("Kolmas numero: " + randomNumber3 + "\n");
		
		
		// Jos kaikki numerot ovat 7, voittaa 3 euroa
			if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7) {
			
			System.out.println("Jättipotti! Kaikki oikein, voitit 3 euroa!");
				
				saldo = saldo+3;
				
				System.out.println("Sinulla on saldoa " + saldo + " euroa\n");
			}
			//Jos 1. ja 2. numero ovat 7, voittaa 2 euroa
			else if (randomNumber1 == 7 && randomNumber2 == 7) {
			
			System.out.println("Onneksi olkoon! Kaksi kolmesta! Voitit 2 euroa");
				
				saldo = saldo+2;
				
				System.out.println("Sinulla on saldoa " + saldo + " euroa\n");
				
			}
			//Jos 2. ja 3. numero ovat 7, voittaa 2 euroa
			else if (randomNumber2 == 7 && randomNumber3 == 7) {
					
			System.out.println("Onneksi olkoon! Kaksi kolmesta! Voitit 2 euroa");
						
				saldo = saldo+2;
						
				System.out.println("Sinulla on saldoa " + saldo + " euroa\n");
			}
			//Jos vain yksi numero on 7, voittaa euron
			else if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7) {
			
			System.out.println("Lucky number 7! Onneksi olkoon, voitit euron!");
				
				saldo++;
				
				System.out.println("Sinulla on saldoa " + saldo + " euroa\n");
				
			//Ei yhtään 7, häviö
			} else {
			
			System.out.println("Hävisit! Ei voittoa tällä kertaa!");
			
				saldo--;
				System.out.println("Sinulla on saldoa " + saldo + " euroa\n");
				
				if (saldo < 1) {
					
				System.out.println("Rahat loppui! Game over!");
					break; }
				}
			System.out.println("Pelataanko uudelleen? Vastaa k tai e");
			vastaus = pelaaja.nextLine();
			
		} while (vastaus.equals("k"));
		
			
			
		pelaaja.close();		
	}	
	  
			
	
}
			
	

