
import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {
        double fiyat,kdv1=0.18,kdv2=0.08,kdvlifiyat;
        Scanner inp=new Scanner(System.in);
        System.out.print("Fiyat Giriniz:");
        fiyat=inp.nextDouble();
        System.out.println("KDV'siz Fiyat : "+"\s"+fiyat+"TL");

        boolean durum1=fiyat>0&&fiyat<1000;


        kdvlifiyat=durum1 ? fiyat+(fiyat*kdv1):fiyat+(fiyat*kdv2);

        System.out.println("KDV'li Fiyat :"+"\s"+kdvlifiyat);

        double kdvtutari;
        boolean durum2=fiyat>0&&fiyat<1000;
        kdvtutari =durum2 ? kdv1 : kdv2 ;

        System.out.println("KDV Tutarı :"+"\s"+kdvtutari);



    }
}
