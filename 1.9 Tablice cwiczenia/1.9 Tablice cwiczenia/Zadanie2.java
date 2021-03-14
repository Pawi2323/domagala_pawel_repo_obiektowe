import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Zadanie2{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner (new File("czylosowac.txt"));
			Scanner sc2 = new Scanner (new File("ileliczb.txt"));
			int [] czylosowac = new int[10];
			int [] ileliczb = new int[10];
			Random losowa = new Random();
			
			String line = sc.nextLine();
			for(int i=0; i<10; i++){
				czylosowac[i] = Integer.parseInt(line.split(" ")[i]);
				ileliczb[i] = sc2.nextInt();
					if(czylosowac[i]==0){
						System.out.print("Wczytalem liczbe 0 - nie losuje liczby");
					}else if(czylosowac[i]==1){
						System.out.print("Wczytalem liczbe 1, wylosowane liczby - ");
						for(int j=0; j<ileliczb[i]; j++){
							System.out.print(losowa.nextInt(80)+1+" ");
						}
					}System.out.print("\n");
				}
		}catch(FileNotFoundException e){
			System.out.println("Plik nie istnieje: "+e.toString());
		}
	}
}