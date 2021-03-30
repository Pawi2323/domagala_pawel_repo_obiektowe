
class Logowanie{
	private String login = "login";
	private String haslo = "haslo";

	public Logowanie(String login, String haslo){
	this.login = login;
	this.haslo = haslo;
	}
	@Override
	public String toString(){
		return login+" "+haslo;
	}
}