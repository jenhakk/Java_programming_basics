import java.util.Scanner;

public class OmaLuokka {

	public static void main(String[] args) {
	
		Scanner kayttaja = new Scanner(System.in);
		
		String biisi;
		
		Kuulokkeet kuulokkeet = new Kuulokkeet();
		Langattomat langattomat = new Langattomat();
		
		langattomat.yhdistaPuhelimeen();
		
		System.out.println("Mik‰ kappale soitetaan seuraavaksi?");
		biisi = kayttaja.nextLine();
		
		kuulokkeet.setKappale(biisi);
		
		kuulokkeet.printData();
		
		langattomat.printData();
		
	}

}class Kuulokkeet {

	public boolean isPlaying;
	protected String kuulokkeet;
	public String kappale;

	public void setKappale(String kappale) {
		this.kappale = kappale;
	}

	//oletusmuodostin
	public Kuulokkeet() {
		
		kuulokkeet = "Kuulokkeet nro 1";
		kappale = "Lemon tree";
		isPlaying = true;
	}
	
	//parametrinen muodostin
	public Kuulokkeet(String kuulokkeet, String kappale) {
		
		this.kuulokkeet = kuulokkeet;
		this.kappale = kappale;
		isPlaying = true;
		
	}
	//parametrinen muodostin
	public Kuulokkeet(String kuulokkeet, String kappale, boolean isOn) {
		
		this.kuulokkeet = kuulokkeet;
		this.kappale = kappale;
		isPlaying = isOn;
	}

	// Metodi jossa musiikki k‰ynnistet‰‰n
	public void play() 
	{
		isPlaying = true;
	}

	// Metodi jossa musiikki sammutetaan
	public void stop() 
	{
		isPlaying = false;
	}

	// Metodi jolla vastataan puheluun
	public void answer()
	{
		isPlaying = false;
		System.out.println("Vastataan puheluun");
	}
	
	//Metodi jolla tulostetaan kuulokkeiden tiedot
	public void printData() {
		System.out.println(kuulokkeet);
		

		if (isPlaying)
			
		{
			System.out.println("Musiikki soi parhaillaan.");
			System.out.println("T‰m‰n hetkinen kappale: " + kappale);
			
		} else {
			System.out.println("Musiikki on pys‰ytetty.");
		}
	}
	
	//Metodi jolla voi muuttaa sit‰ soiko musiikki ja mik‰ kappale soi
	public void muutaTietoja(boolean isOn, String kappale)
	{
		isPlaying = true;
		this.kappale = kappale;
		
	}
}
class Langattomat extends Kuulokkeet
{
	boolean yhdistetty = false;
	
public Langattomat() {
	isPlaying = true;
	kuulokkeet = "Langattomat kuulokkeet 1";
	kappale = "Bailaten koko el‰m‰";
	yhdistetty = true;
}

	protected void yhdistaPuhelimeen()
{
	yhdistetty = true;
	System.out.println("Bluetooth yhdistetty puhelimeen.");
	}
}