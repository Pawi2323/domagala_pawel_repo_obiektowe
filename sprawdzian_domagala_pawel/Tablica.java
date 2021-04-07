import java.util.Random;

class Tablica{
	public int[] tablica = new int [10];
	private Random rand = new Random();
	
	public Tablica(){
		for(int i=0; i<10; i++){
			tablica[i] = rand.nextInt(20) - 10;
		}
	}
}