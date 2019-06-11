/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja.java;

import java.util.Arrays;

/**
 *
 * @author PC03-LAB02
 */
public class BurbujaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a={82,50,2,30,22,7,17};
        int tem;
        System.out.println("NUMEROS DESORDENADOS"+Arrays.toString(a));
        for(int i=0;i< a .length -1;i++){
            for(int j =0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    tem= a[j+1];
                    a[j+1]=a[j];
                    a[j]=tem;
                    
                }
            }
        }
        System.out.print(" //NUMEROS ORDENADOS "+Arrays.toString(a));
           
                     
    }    
     
} 

