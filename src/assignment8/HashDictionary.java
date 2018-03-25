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
public class HashDictionary <Key extends Comparable<Key>, E>{
    
    private static final int defaultSize = 10;
    private int count;
    private int maxSize;
    private HashTable<Key, E> hashTable; 

    

    public HashDictionary(){
        this(defaultSize);
        
    }
    
    public HashDictionary(int s){
        maxSize = s;
        count = 0;
        
    }
    public int insert(E item, int pos) {
        
    }


    public int delete(int pos) {
        
    }


    public int show() {
        
    }


    public int count() {
        
    }


    public int find(){
        int home;
        int pos = home = hasher(k);
        for (int i=1; (hashTable[pos] != null) && (hashTable[pos].key().compareTo(k) != 0); i++)
            pos = (home + p(k, i)) % count; 
        if (hashTable[pos] == null) return null;
        else return hashTable[pos].value();
    }
    
    
   
    
    
    public void clear() {
        count = 0;
    }

    
    public boolean empty() {
        
    }

    
    public boolean full() {
        
    }
    
    private int hasher(){
        
    }
    
    private Key key(int pos){
        return hashTable[pos];
    }
    
}
