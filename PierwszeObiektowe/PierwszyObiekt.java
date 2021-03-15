class PierwszyObiekt{
	public static void main (String [] args){
		//Zdefiniowanie i stworzenie obiektu
		ObiektPudelko op = new ObiektPudelko();
		System.out.println("Domysla wartosc: "+op.wysokosc);
		
		op.wysokosc = 100;
		System.out.println("Zmodyfikowana wartosc: "+op.wysokosc);
		
		Osoba os = new Osoba();
		System.out.println(os.imie+" "+os.nazwisko);
	}
}