
class Trojkat{

	public Trojkat(double a,double h ){
		System.out.println("Pole trojkata prostokata: "+(a*h/2));
	}
	public Trojkat(double a){
		System.out.println("Pole trojkata prostokata: "+((a*a)*Math.pow(a, 1/3))/4);
	}
}