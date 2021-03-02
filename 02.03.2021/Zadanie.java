

public class Zadanie{
	public static void main(String[] args){
		tabliczkaMnozenia();
	}
	private static void tablica(){
		int [][] tab = new int [2][2];
		tab [0][0] = 1;
		tab [0][1] = 2;
		tab [1][0] = 3;
		tab [1][1] = 4;
		
		for (int i=0; i<tab.length; i++){
			for (int j=0; j<tab[i].length; j++){
				System.out.println(tab[i][j]);
			}
		}
	}
	
	private static void tabliczkaMnozenia(){
		int [][] tab = new int [10][10];
		for(int i=0; i<tab.length;i++){
			for(int j=0; j<tab[i].length;j++){
				tab[i][j] = (i+1)*(j+1);
			}	
		}
		for(int i=0; i<tab.length;i++){
			for(int j=0; j<tab[i].length;j++){
				System.out.print(tab[i][j]+"\t");
			}	
			System.out.println();
		}
	}
}