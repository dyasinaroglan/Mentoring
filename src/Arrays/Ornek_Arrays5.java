package Arrays;

import java.util.Scanner;

public class Ornek_Arrays5 {
    public static void main(String[] args) {
        /*
    While döngüsü yardimiyla bir tane ATM programi yazin


    Ekran Şu şekilde olsun:
     1. İşlem: Bakiye Öğrenme
     2. İşlem: Para Çekme
     3. İşlem: Para Yatırma
     Çıkış   : q
     */

        int bakiye = 1000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("*********MENÜ***********");
        String islemler = "1.bakiye öğrenme\n" +
                "2.para çekme\n" +
                "3.para yatırma\n" +
                "4.çıkış için q'ya basınız\n";
        System.out.println(islemler);
        System.out.println("*************************");

        while (true) {
            System.out.println("işlemi seçiniz:");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("sistemden çıkılıyor");
                break;
            }else if(islem.equals("1")){
                System.out.println("güncel bakiye ="+ bakiye);
            }else if(islem.equals("2")){
                System.out.println("çekmek istediğiniz tutar="+bakiye);
                int miktar=scanner.nextInt();
                scanner.nextLine();
                if(bakiye<miktar){
                    System.out.println("bakiye yetersiz =" +bakiye);
                }else {
                    bakiye-= miktar;
                    System.out.println("güncel bakiye:");
                }
            }else if(islem.equals("3")){
                System.out.println("yatırmak istediğiniz tutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("güncel bakiye="+bakiye);
            }
            else {
                System.out.println("geçersiz işlem");
            }
        }
    }
}
