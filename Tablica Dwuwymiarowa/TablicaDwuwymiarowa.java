

class TablicaDwuwymiarowa{
	public static void main(String[] args){
		private static void tab2dFirst(){
			int [][] tab2d = new int [5][2];
			tab2d[0][1] = 50;
			tab2d[2][1] = -200;
			tab2d[4][0] = 444;
			for (int i=0; i<tab2d.length; i++){
				for (int j=0; j<tab2d[i].length; j++){
					System.out.println(tab2d[i][j]);
				}
				System.out.println("Koniec petli ze zmienna j");
			}
			System.out.println("Koniec petli ze zmienna i");
		}
			private static void PrzypomnienieTablic(){
				int [] tab = new int[5];
				tab[0] = 40;
				for(int i=0;i<tab.length();i++){
					System.out.println(tab[i]);
				}
            }
		}
	}
}