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

        int bakiye = 1000, islem;
        int miktar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("hoşgeldiniz");
        System.out.println("güncel bakiyeniz:" + bakiye + " TL");


        while (bakiye > 0) {
            System.out.println();
            System.out.println("1.bakiye öğrenme");
            System.out.println("2.para çekme");
            System.out.println("3.para yatırma");
            System.out.println("4.çıkış");
            System.out.println("yapmak istediğiniz işlemi seçiniz:");
            islem = scanner.nextInt();
            miktar=scanner.nextInt();

            if(islem==1){
                System.out.println("güncel bakiyeniz= "+bakiye+" TL");
            }else if(islem==2){
                System.out.println("çekilen para miktarı");
                miktar=scanner.nextInt();
                if(bakiye<miktar){
                    System.out.println("bakiyeniz yetersiz");
                }else {
                    bakiye-=miktar;
                }
                }else if(islem==3){
                System.out.println("yatırmak istediğiniz miktar");
                miktar=scanner.nextInt();
                bakiye+=miktar;
            }else if (islem==4){
                System.out.println("çıkış");
                break;
            }else {
                System.out.println("tanımlanmayan bir işlem girdiniz");
            }
        }
    }
}
