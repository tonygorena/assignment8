/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

/**
 *
 * @author tonygorena
 */
public class HashTable<Key extends Comparable<Key>, E> {

    private static final int defaultSize = 10;
    private int pos;
    private E[] hashArray;
    private int max;
    int count = 0;

    HashTable() {
        this(defaultSize);

    }

    HashTable(int size) {
        max = size;
        int count = 0;                     //amount of objects in elements
        hashArray = (E[]) new Object[size];

    }

    public int key() {
         = hashArray[pos];
        return this.hasher(str);

    }

    private int hasher(E obj) {
        
        byte[] byt =  (byte[])obj;
        int bytLength = byt.length;
        int i, sum;
        for (sum = 0, i = 0; i < str.length(); i++) {
            
        return sum % max;

    
}
