/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet6prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1a {
    public static void main(String[] args){
        BufferedReader dataIn =new BufferedReader (new InputStreamReader (System.in));
     
        String a="";
        String b="";
        String c="";
   
        int Avarage;
               System.out.println("Program Nilai Ujian User");
        
        try {
            System.out.println("Nilai 1:");
            a = dataIn.readLine();
            
            System.out.println("Nilai 2:");
            b =dataIn.readLine();
            
             System.out.println("Nilai 3:");
            c =dataIn.readLine();
            
         }
       catch (IOException e){
                   System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
                  }
        int nilai1;
                  int nilai2;
                  int nilai3;
                                  nilai1 = Integer.parseInt(a);
                  nilai2 = Integer.parseInt(b);
                  nilai3 = Integer.parseInt(c);
                                  int rata=(nilai1+nilai2+nilai3)/3;
       
             System.out.print("Nilai Rata-Rata Kamu Adalah= "+rata); 
        
     if (rata >=60){
         System.out.println(":-) ");
        }
                  else {
                System.out.println(":-(");   
                }                
    }
}