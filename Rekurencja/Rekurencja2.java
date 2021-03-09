class Rekurencja2{
	public static void main(String []args){
		
		/*
		long liczba = obliczanieSilni(15);
		System.out.println(""+Integer.MAX_VALUE);
		System.out.println(""+Long.MAX_VALUE);
		System.out.println("Wynik: "+liczba);
		*/
		System.out.println(WyswietlanieImienia("Anna"));
	}
	private static String WyswietlanieImienia(String wyraz){
		if (wyraz.length() > 1){
			return wyraz + "\n" + WyswietlanieImienia(wyraz.substring(0,wyraz.length()-1));
		}
		return wyraz;
	}
	
	private static int SumaLiczb(int liczba){
		if(liczba > 0){
			return liczba+SumaLiczb(liczba-1);
			// Wprowadzamy liczbe 3
			// return 3 + (return 2 + (return 1 + 0 ))
		}
		System.out.println("Koniec rekurencji liczba = "+ liczba);
		return 0;
	}
	//Silnia 7! = 7*6*4*4*3*2*1
	private static long obliczanieSilni(int liczba){
		if(liczba > 1){
			return liczba * obliczanieSilni(liczba-1);
		}
		return 1;
	}
}