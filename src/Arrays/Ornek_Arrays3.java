package Arrays;

public class Ornek_Arrays3 {
    public static void main(String[] args) {
        /*
    Bir Array icerisindeki verileri for döngüsü kullanarak console'a yazdiran bir program yaziniz.
     */

            // For ile
            String[] isimler={"Malik","Yasin","Mustafa","Ahmet","Kemal","Ayşe","Hakan"};
            for (int i=0;i<isimler.length;i++){
                System.out.println(isimler[i]);
            }
            //Foreach ile
            System.out.println("****************");
            for (String isim:isimler) {
                System.out.println(isim);

            }

        }
    }
