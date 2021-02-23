import java.util.Random;

public class Zadanie1{
	public static void main(String[] args){
		int[] pd = new int[10];
        Random pd_losowa = new Random();
        //zapełnienie tablicy pd
        for(int i=0; i<10; i++) {
			pd[i] = pd_losowa.nextInt(6)+0;
        }
        //Wyświetlenie tablicy pd
        for(int i=0; i<10; i++) {
			System.out.print(pd[i]+" ");
        }
	}
}