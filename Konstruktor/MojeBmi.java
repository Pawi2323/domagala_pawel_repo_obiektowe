class MojeBmi{
	private int wzrost = 0;
	private int waga = 0;
	
	//KONSTRUKTOR
	public MojeBmi(int wzrost, int waga){
		System.out.println("W konstruktorze "+wzrost+" "+waga);
		this.wzrost = wzrost; //this - odwoluje sie do atrybutow OBIEKTU
		this.waga = waga;
	}
	//metoda zwracajaca BMI jako liczbe zmiennoprzecinkowa
	
	
}