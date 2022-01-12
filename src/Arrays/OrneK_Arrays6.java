package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OrneK_Arrays6 {
    public static void main(String[] args) {
        //   Consider an integer array, the number of elements in which is determined by the user.
        //   The elements are also taken as input from the user.
        //   Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.

        Scanner scanner = new Scanner(System.in);
        System.out.println("dizinin eleman sayısını giriniz= ");
        int elemanSayısı = scanner.nextInt();
        int[] array = new int[elemanSayısı];
        for (int i = 0; i < elemanSayısı; i++) {
            int eleman = scanner.nextInt();
            array[i] = eleman;
        }
        int enbuyukFark =0;
        int enKucukFark =0;
        int count =0;
        for (int j = 0; j < array.length; j++) {
            for (int k = j+1; k < array.length; k++) {
                int fark1 = Math.abs(array[j] - array[k]);
                if(fark1>enbuyukFark){
                    enbuyukFark=fark1;
                }
                int fark2 = Math.abs(array[0] - array[1]);
                if(count==0){
                    enKucukFark=fark1;
                    count++;
                }

                if(fark2<enKucukFark){
                    enKucukFark=fark2;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("en büyük fark = "+enbuyukFark);
        System.out.println("en küçük fark = "+enKucukFark);
    }
    public int enKucukFark(int[] array){
        int enKucukFark =0;
        int count =0;
        for (int j = 0; j < array.length; j++) {
            for (int k = j+1; k < array.length; k++) {
                int fark1 = Math.abs(array[j] - array[k]);

                int fark2 = Math.abs(array[0] - array[1]);
                if(count==0){
                    enKucukFark=fark1;
                    count++;
                }

                if(fark2<enKucukFark){
                    enKucukFark=fark2;
                }
            }
        }
        return enKucukFark;
    }
    public int enBüyükFark(int[] array){
        int enBuyukFark =0;
        int count =0;
        for (int j = 0; j < array.length; j++) {
            for (int k = j+1; k < array.length; k++) {
                int fark1 = Math.abs(array[j] - array[k]);

                int fark2 = Math.abs(array[0] - array[1]);

                if(fark2>enBuyukFark){
                    enBuyukFark=fark2;
                }
            }
        }
        return enBuyukFark;
    }
}
