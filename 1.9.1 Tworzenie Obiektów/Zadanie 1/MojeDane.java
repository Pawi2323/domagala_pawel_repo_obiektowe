
class MojeDane{
	public String imie = "";
	public String nazwisko = "";
	public String klasa = "";

	public MojeDane(String imie, String nazwisko, String klasa){
	this.imie = imie;
	this.nazwisko = nazwisko;
	this.klasa = klasa;
	System.out.println(imie+" "+nazwisko+" "+klasa);
	}

	public void dane(){
		System.out.println(imie+" "+nazwisko+" "+klasa);
	}
	
	@Override
	public String toString(){
		return imie+" "+nazwisko+" "+klasa;
	}
}