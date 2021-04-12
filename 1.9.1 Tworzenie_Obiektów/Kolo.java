
class Kolo{
	public double liczba_pi = 3.1415;
	public double promien = 0;

	public void promien(double promien){
		this.promien = promien;
	}
	public double pole_kola(){
		return liczba_pi*(promien*promien);
	}
	public double obwod_kola(){
		return 2*liczba_pi*promien;
	}
}