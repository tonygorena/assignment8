/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

/**
 * @author tonygorena
 */
public class HashDictionary<E> {

    private static final int DEFAULT_SIZE = 10;
    private E[] hashArray;
    private E[] overflowArray;

    Hasher hasher = new Hasher<E>();
    int pos = 0;
    int count = 0;
    int slots = 2;
    int size = 0;
    int overPos = 0;


    HashDictionary() {
        this(DEFAULT_SIZE);

    }

    HashDictionary(int s) {
        hashArray = (E[]) new Object[s * slots];
        overflowArray = (E[]) new Object[s * slots];
        size = s;
    }

    public int insert(E item) {


        pos = this.hasher.hashForItem(item, size) * slots;
        if (hashArray[pos] == null) {
            hashArray[pos] = item;
            count++;
            return pos;
        } else if (hashArray[pos + 1] == null) {
            hashArray[pos + 1] = item;
            count++;
            return pos+1;
        } else {
            overflowArray[overPos] = item;
            overPos++;
            return overPos-1;
        }

    }

    public int delete(E item) {

        int result = this.find(item);

        if (result < 0)
            return result;
       if(hashArray[result] == item){
           hashArray[result] = null;
       }
       else if (overflowArray[result] == item){
           overflowArray[result] = null;
           overPos--;
           count--;
           return result;
       }

        count--;
        return result;
    }

    public int find(E item) {
        if (count == 0)
            return -2;
       int result = this.hasher.hashForItem(item, size) * slots;
       for (int i = result ; i < result + slots; i++ ) {
           if (item == hashArray[i]) {
               return i;
           }
       }
       for (int j= 0; j < overflowArray.length; j++){
           if (item == overflowArray[j]) {
               return j;
           }
       }

        return -4;
    }

    public void show() {
        for (int i = 0; i < hashArray.length; i++) {
            System.out.println(hashArray[i]);
        }
        for (int i = 0; i < overflowArray.length; i++) {
            System.out.println(overflowArray[i]);
        }

    }


}
