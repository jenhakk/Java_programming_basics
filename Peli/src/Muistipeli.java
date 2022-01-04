import java.util.Random;
import java.util.Scanner;

public class Muistipeli {

	public static void main(String[] args) {
		
		
		Scanner pelaaja = new Scanner(System.in);
		Random random = new Random();
		
		int[] pelinNumerot = new int[7];
		int[] arvatutNumerot = new int[7];
		int i;
		int k;
		
		//Arvotaan 7 numeroa ja n‰ytet‰‰n ne pelaajalle
		System.out.println("Yrit‰ muistaa alla olevat numerot. N‰et ne 3 sekunnin ajan.");
		
		for (i = 0; i<pelinNumerot.length; i++)
			
		{
			pelinNumerot[i] = random.nextInt(5)+1; 
			System.out.print(pelinNumerot[i]+" ");
		}	
		
		
		try
		{
			Thread.sleep(3000);
		
		} catch(InterruptedException ex)
		
		{	Thread.currentThread().interrupt();
		}
		
		for (i = 0; i<20; i++)
			
			System.out.println();
		
		for (i = 0; i<arvatutNumerot.length; i++)
			
		{
			System.out.println("Anna " + (i+1) + ". numero");
			arvatutNumerot[i] = Integer.parseInt(pelaaja.nextLine());
		}
		
		System.out.print("Oikeat numerot olivat: ");
		
		for (i=0; i<arvatutNumerot.length; i++)
		{ System.out.print(pelinNumerot[i] +" ");
		
		
		}
		System.out.println();
		System.out.print("Sinun numerosi olivat: ");
		
		for (i=0; i<arvatutNumerot.length; i++)
		{ System.out.print(arvatutNumerot[i] +" ");
		
		} System.out.println();
		
		
		int j = 0;
		for (k = 0; k<pelinNumerot.length; k++)
			
		{ if (pelinNumerot[k] == arvatutNumerot[k]) {
			
			j++;
		}
		
		
		}	
		System.out.println("Sinulla oli " + j + "/7 oikein");
		
		
		int prosenttiosuus = j *100 / 7;
		
		System.out.println("Tulos prosentteina: " + prosenttiosuus + "%");
	}
			
			
		
		
	}

