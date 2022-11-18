package com.mycompany.array;
public class TablasHash<T> {

    public static void main(String[] args) {
        
        HashTableADT h = new HashTableADT(7);
        System.out.println(h.funcionHash("b"));
        System.out.println(h);
        h.Add("500", "a");
        System.out.println(h);
        h.Add("7", 1);
        h.Add("48", 9);
        System.out.println(h);
        System.out.println("");
        h.Add("46", 2);
        h.Add("124", 5);
        h.Add("63", 11);
        h.Add("a", "e");
        System.out.println(h);
        System.out.println(h.valueOf("63"));
        System.out.println("");
        h.Remove("500");
        System.out.println(h);
        
        System.out.println("---------------------------");
        int a= 63%7;
        System.out.println(a);
       
    }
    
}
