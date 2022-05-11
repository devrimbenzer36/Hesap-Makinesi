package Github;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
        int sayi1,sayi2,select;
        Scanner imput = new Scanner(System.in);
        System.out.print("İlk sayiyi giriniz: ");
        sayi1 = imput.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        sayi2=imput.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lutfen seçiminizi yapınız: ");
        select = imput.nextInt();

        if(select==1){
            System.out.println("İşleminizin sonucu : " + (sayi1 + sayi2));
        }
        else if(select==2 && sayi1>sayi2){
            System.out.println("İşleminizin sonucu: " + (sayi1-sayi2));
        }
        else if(select==2 && sayi2>sayi1){
            System.out.println("İşleminizin sonucu: " + -(sayi2-sayi1));
        }

        else if(select==3){
            System.out.println("İşleminizin sonucu: " + (sayi1 * sayi2));
        }
        else if(select==4){
            System.out.println("İşleminizin sonucu: " + (sayi1 / sayi2));
        }
        else {
            System.out.println("Lütfen 1-4 arasında bir seçim yapınız");
        }
    }
}