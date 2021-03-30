class Konstruktor{
	public static void main (String[] args){
		MojeDane md = new MojeDane("Imie", "Nazwisko", "Klasa");
		System.out.println(md.imie+" "+md.nazwisko+" "+md.klasa);
		
		Logowanie lg = new Logowanie();
		System.out.println(lg.toString());
	
		Kolo k1 = new Kolo();
			k1.promien(4);
			System.out.println("Pole: "+k1.pole_kola()+" Obwod: "+k1.obwod_kola());
			
		Kolo k2 = new Kolo();
			k2.promien(20);
			System.out.println("Pole: "+k2.pole_kola()+" Obwod: "+k2.obwod_kola());
	}
}