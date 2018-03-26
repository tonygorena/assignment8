/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

/**
 * @author tonygorena
 */
public class Hasher<E> {


    public int hashForItem(E item, int size) {
        int parta = 0;
        int partb = 0;
        int partc = 0;
        int split = 0;

        byte[] byt = item.toString().getBytes();
        for (int i = 0; i < byt.length-1; i = i + byt.length / 3) {

            int part = i + byt.length / 3;
            int sum = 0;
            for (int j = i; j < part; j++) {
                sum = sum + byt[j];

            }
            split++;
            switch (split) {
                case 1:
                    parta = sum;
                    break;
                case 2:
                    partb = sum;
                    break;
                case 3:
                    partc = sum;
                    break;
            }
        }
        int hash = parta * partb;
        hash = hash ^ partc;
        hash = hash % size;


        return hash;
    }


}
