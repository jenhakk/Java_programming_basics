
public class LeluHarjoitus {

	public static void main(String[] args) {
		
	Lelu lelu = new Lelu();
	Vieteriauto vieteriauto = new Vieteriauto();
	
	lelu.tulostaTiedot();
	
	vieteriauto.tulostaTiedot();
	vieteriauto.kiihdyta();
	vieteriauto.tulostaTiedot();
	
	

	}

} // LeluHarjoitus-luokan loppu

class Lelu {
	
	protected String nimi;
	protected int painoG;
	
	public Lelu()
	{
		nimi = "Auto";
		painoG = 50;

	}
	
	public Lelu(String nimi, int painoG)
	
	{
		this.nimi = nimi;
		this.painoG = painoG;
	}
	
	protected void tulostaTiedot()
	{
		System.out.println("Lelun nimi on " + nimi + " ja sen paino on " + painoG + " grammaa");
	}
}

class Vieteriauto extends Lelu
{
	int nopeus;
	
	public Vieteriauto()
	{
		nimi = "Vieteriauto";
		painoG = 100;
		nopeus = 10;
	}
	
	public Vieteriauto(String nimi, int painoG, int nopeus)
	
	{
		this.nimi = nimi;
		this.painoG = painoG;
		this.nopeus = nopeus;
	}
	
	public void kiihdyta()
	{
		nopeus++;
	}
	
	@Override
	public void tulostaTiedot()
	{
		super.tulostaTiedot();
		System.out.println("Nopeus on " + nopeus);
		
	}
}