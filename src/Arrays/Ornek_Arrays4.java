package Arrays;

public class Ornek_Arrays4 {
    public static void main(String[] args) {


    /*
    Sonsuza kadar çalışan bir tane while loop oluşturun ve 100. çalışması sırasında döngüyü
    "break" ifadesi ile sona erdirin.
     */


        int sayi = 0;
        while (true) {

            sayi++;
            System.out.println(sayi);
            if (sayi == 100) {
                break;

            }

        }
    }
}
