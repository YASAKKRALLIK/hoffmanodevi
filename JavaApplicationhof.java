/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationhof;

import java.util.Scanner;

/**
 *
 * @author YASİN Demirel 02210201001
 */
public class JavaApplicationhof {
    static String[] mako;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] q=frakans();
    String[] b=sirala(q);
        for (int i = 0; i < 4; i++) {
            System.out.print(b[i]);
            System.out.println(q[i]);
        }
        for (int i = 0; i < mako.length; i++) {
            if(mako[i].equals("A")){
                System.out.print(b[0]);
            }else{
                if(mako[i].equals("B")) {
                    System.out.print(b[1]);
                }else{
                    if(mako[i].equals("C")) {
                    System.out.print(b[2]);
                }else{
                        if(mako[i].equals("D")) {
                    System.out.print(b[3]);
                }
                    }
                }
            }
            System.out.print(" ");    
        }
        
        
        
        
        
    }
    public static int[] frakans(){
        Scanner sc=new Scanner(System.in);
        String ale=sc.nextLine();
        String[] er=ale.split(" ");
        mako=er;
        String[] QWE={"A","B","C","D"};
        int[] frek=new int[4];
        for (int i = 0; i < er.length; i++) {
            if(er[i].equals("A")){
                frek[0]++;  
            }else{
                if(er[i].equals("B")){
                frek[1]++;
                    
                }else{
                    if(er[i].equals("C")){
                        frek[2]++;
                    }else{
                        if(er[i].equals("D")){
                            frek[3]++;
                        }
                    }
                }
            }
            
        }for (int i = 0; i < 4; i++) {
            System.out.print(frek[i]);
            
        }
        System.out.println("");
        return frek;
        
       
    }
    public static String[] sirala(int[] gelen){
        int[] a=gelen;
        int[] b=new int[4];
        for (int i=0;i<4;i++){
            b[i]=i;
        }
        int temp;int temp2;
        for (int j=0;j<3;j++){
        for (int i = 0; i < 3; i++) {
            if (a[i+1]<a[i]){
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                temp2=b[i];
                b[i]=b[i+1];
                b[i+1]=temp2;     
            }
        }
    }
        String[] o=new String[4];
        
            o[b[0]]="00";
            o[b[1]]="01";
            o[b[2]]="10";
            o[b[3]]="11";


        
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        return o;
    }
}
