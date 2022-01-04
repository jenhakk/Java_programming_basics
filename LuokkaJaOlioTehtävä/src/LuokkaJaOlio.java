
public class LuokkaJaOlio {

	public static void main(String[] args) {
		
		//luodaan kolme oliota
		Kuulokkeet kuulokkeet1 = new Kuulokkeet();
		Kuulokkeet kuulokkeet2 = new Kuulokkeet("Kuulokkeet nro 2", "Drop dead");
		Kuulokkeet kuulokkeet3 = new Kuulokkeet("Kuulokkeet nro 3", "Disko", false);

		kuulokkeet1.play();

		kuulokkeet2.stop();

		if (kuulokkeet1.isPlaying == true || kuulokkeet2.isPlaying == true) {
			System.out.println("Musiikki soi");
		}

		if (kuulokkeet1.isPlaying == false || kuulokkeet2.isPlaying == false) {

			System.out.println("Musiikki ei soi");
		}

		kuulokkeet2.answer();
		kuulokkeet3.printData();
		kuulokkeet3.muutaTietoja(true, "Take you dancing");
		kuulokkeet3.printData();

		kuulokkeet2.printData();
	}

} // class LuokkaJaOlio loppuu
		//Luodaan luokka Kuulokkeet

class Kuulokkeet {

	public boolean isPlaying;
	String kuulokkeet;
	String kappale;

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
		System.out.println("T‰m‰n hetkinen kappale: " + kappale);

		if (isPlaying)
			
		{
			System.out.println("Musiikki soi parhaillaan.");
			
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
