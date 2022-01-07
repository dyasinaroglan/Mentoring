package Loops;

public class Ornek_Loops1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (j==3){
                    continue;
                }
                System.out.print(i+","+j+" ");
            }
        }
    }
}
