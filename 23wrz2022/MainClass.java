import java.io.File;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj link z którego chcesz pobrać: ");
    String image = sc.nextLine();
    DownloadImage downloadImage = new DownloadImage();
    SaveImageImp saveImageImp = new SaveImage();
    System.out.println("Podaj lokalizacje pliku: ");
    String sciezka = sc.nextLine();
    System.out.println("Podaj nazwe pliku: ");
    String nazwa = sc.nextLine();
    System.out.println("Podaj rozszerzenie pliku: ");
    String roz = sc.nextLine();

    File plik = new File("/home/domagalapawel/"+sciezka+"/"+nazwa+"."+roz);
    if(plik.exists()){
        System.out.println("Taki plik istnieje");
        System.out.println("1.Podaj nowa nazwe pliku (jesli podasz tą samą plik sie nadpisze)");
        nazwa = sc.nextLine();


    }
    try {
        saveImageImp.save(downloadImage.downloadUsingStream(image),"/home/domagalapawel/"+sciezka, nazwa, roz);
    } catch (Exception e) {
        System.out.println("Nie pobrało sie D:");
    }
    
    }
}

        
