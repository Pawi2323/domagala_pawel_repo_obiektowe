import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Zadanie1{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner (new File("uczniowie.txt"));
			int[] tab = new int[10];
			Random losowa = new Random();
			//zapełnienie tablicy
			for(int i=0; i<10; i++) {
				tab[i] = losowa.nextInt(6)+1;
			}
				String [] uczen = new String[10];
				for(int i=0; i<10; i++){
					//wyswietlenie obydwu tablic
					System.out.println(uczen[0]=sc.nextLine()+" "+tab[i]);
				}
		}catch(FileNotFoundException e){
			System.out.println("Plik nie istnieje: "+e.toString());
		}
	}
}