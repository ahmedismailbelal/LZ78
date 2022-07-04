/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lz88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abdelrahman Hany
 */
public class MainLz88 {
    
    
    static   ArrayList<String> array1 = new ArrayList<String>();
        
    
    
    
    static int myfunction(int key, int i,String sup,String data, int index){
        
        
        
        if (array1.lastIndexOf(sup) > 0 && i + 1 < data.length()) {
            index = array1.lastIndexOf(sup);
            sup = data.substring(key, i + 2);
            i++;
            i = myfunction(key, i, sup, data, index);

        } else if (key != i) {
            Tag a = new Tag(index, data.charAt(i));
            System.out.print(a.toString());
            array1.add(sup);

        } else {
            Tag a = new Tag(index, data.charAt(i));
            System.out.print(a.toString());
            array1.add(data.charAt(i) + "");
        }
        return i;
    
    }
    
    
    public static void main(String[] args) throws Exception 
    {               
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your data");
        String data = inp.next();

        array1.add(0, "");
        for (int i = 0; i < data.length(); i++) {
            String sup = data.substring(i, i + 1);
            int index = 0;
            int key = i;

            if (i == 0) {
                Tag a = new Tag(0, data.charAt(0));
                System.out.println(a.toString());
                array1.add((data.charAt(0) + ""));
            } else {
                if (array1.lastIndexOf(sup) > 0 && i + 1 < data.length()) {
                    index = array1.lastIndexOf(sup);
                    sup = data.substring(key, i + 2);
                    i++;

                    i = myfunction(key, i, sup, data, index);

                } else if (key != i) {
                    Tag a = new Tag(index, data.charAt(i));
                    System.out.print(a.toString());
                    array1.add(sup);

                } else {
                    Tag a = new Tag(index, data.charAt(i));
                    System.out.print(a.toString());
                    array1.add(data.charAt(i) + "");
                }
            }
        }


        
        
        
    }
    
}
