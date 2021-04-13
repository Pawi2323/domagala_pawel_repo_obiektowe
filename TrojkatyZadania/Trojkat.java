
class Trojkat{
	private int a = 0;
	private int b = 0;
	private int c = 0;
	private int h = 0;
	
	public Trojkat(int a,int b,int c,int h ){
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}
	
	@Override
	public String toString(){
		return "Pole trojkata: "+(a*h/2);
	}
}