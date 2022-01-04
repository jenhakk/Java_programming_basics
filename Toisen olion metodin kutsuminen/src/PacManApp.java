public class PacManApp {

	public static void main(String[] args) {

		Pacman pacman = new Pacman();
		
		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit();
		Fruit fruit3 = new Fruit();
		
		Ghost ghost = new Ghost();
		
//		System.out.println(fruit1.isVisible);
//		System.out.println(fruit2.isVisible);
//		System.out.println(fruit3.isVisible);
		
		ghost.syoPacman(pacman);
		
	}

}

class Pacman
{
    public int points;
    public int elamat;

    public Pacman()
    {
    	points = 0;
    }

    public void printData()
    {
        System.out.println(points);
    }

    public void eat()
    {
    	System.out.println("Pac-Man ate fruit");
    }
    public void vahennaElama() {
    	
    	System.out.println("Pacman syöty");
    	elamat--;
    }
}


class Fruit
{
    public boolean isVisible;

    public Fruit()
    {
    	isVisible = true;
    }

    public void disappear()
    {
    	isVisible = false;
        System.out.println("Fruit is hidden");
    }
}
class Ghost
{
	public void syoPacman(Pacman pacman)
	{
		pacman.vahennaElama();
	}
}
