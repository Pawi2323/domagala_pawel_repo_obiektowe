import java.util.Scanner;


public class Zadanie{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("1-kwadrat\n2-prostokat\nexit-zamyka program\nWybierz figure: ");
		int pd_a = sc.nextInt();
		String pd_b = sc.nextLine();
		String nic = "";
		
		
		if(pd_a==1){
			System.out.print("Podaj bok kwadratu: ");
			int pd_kw = sc.nextInt();
			while(pd_kw<=0){
			System.out.print("Podaj bok kwadratu: ");
			pd_kw = sc.nextInt();
			}
			
			for(int i=1; i<=pd_kw; i++){
				for(int j=1; j<=pd_kw; j++){
					if(i==1||j==1||i==pd_kw||j==pd_kw){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("Obwod kwadratu wynosi: "+(pd_kw*4));
			System.out.println("Pole kwadratu wynosi: "+(pd_kw*pd_kw));
			System.out.print("Prosze wpisac exit aby wylaczyc program: ");
			
		}else if(pd_a==2){
			System.out.print("Podaj pierwszy bok prostokata: ");
			int pd_pr = sc.nextInt();
			System.out.print("Podaj drugi bok prostokata: ");
			int pd_pr2 = sc.nextInt();
			while(pd_pr<=0||pd_pr2<=0){
			System.out.print("Podaj pierwszy bok prostokata: ");
			pd_pr = sc.nextInt();
			System.out.print("Podaj drugi bok prostokata: ");
			pd_pr2 = sc.nextInt();
			}
			
			for(int i=1; i<=pd_pr; i++){
				for(int j=1; j<=pd_pr2; j++){
					if(i==1||j==1||i==pd_pr||j==pd_pr2){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
				System.out.println("Obwod prostokata wynosi: "+(pd_pr*2+pd_pr2*2));
				System.out.println("Pole prostokata wynosi: "+(pd_pr*pd_pr2));
				System.out.print("Prosze wpisac exit aby wylaczyc program: ");
		}else{
			System.out.println("Wybrano zla figure");
		}
		while(!nic.equals("exit")){
            		nic = sc.nextLine();
           		if(!nic.equals("exit")){
                		pd_b= pd_b+"\n"+nic;
			}
		}
	}
}
