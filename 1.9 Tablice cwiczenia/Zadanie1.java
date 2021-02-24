import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException; //Raportowanie błędów

public class Zadanie1{
	public static void main(String[] args){
		try{
			int[] pd = new int[10];
			Random pd_losowa = new Random();
			//zapełnienie tablicy pd
			for(int i=0; i<10; i++) {
				pd[i] = pd_losowa.nextInt(7)+0;
			}
			//Wyświetlenie tablicy pd
			for(int i=0; i<10; i++) {
				System.out.print(pd[i]+" ");
			}
			Scanner sc = new Scanner (new File("uczniowie.txt"));//Przygotowanie do czytania danych z pliku
			while(sc.hasNext()){
				String s = sc.nextLine();
				String[] a = new String[10];
				for(int i=0; i<10; i++) {
				System.out.println(a);
				}
			}
		} catch(FileNotFoundException e){
			System.out.println("Plik nie istnieje: "+e.toString());
		}
	}
}