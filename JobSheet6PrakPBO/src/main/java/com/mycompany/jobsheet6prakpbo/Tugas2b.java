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
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas2b {
    public static void main(String[] args){
        BufferedReader dataIn =new BufferedReader (new InputStreamReader (System.in));

        String angka="";

        System.out.println("Masukkan Angka Dari 1-10");

        try {
          angka = dataIn.readLine();
        }
        catch
          (IOException e){
           System.out.println("Invalid Number!");
        }
        int i = Integer.parseInt(angka);

        switch(i){
        case 1:
            System.out.println("Satu");
            break;
        case 2:
            System.out.println("Dua");
            break;
        case 3:
            System.out.println("Tiga");
            break;
        case 4:
            System.out.println("Empat");
            break;
        case 5:
            System.out.println("Lima");
            break;
        case 6:
            System.out.println("Enam");
            break;
        case 7:
            System.out.println("Tujuh");
            break;
        case 8:
            System.out.println("Delapan");
            break;
        case 9:
            System.out.println("Sembilan");
            break;
        case 10:
            System.out.println("Sepuluh");
            break;
            default:
            System.out.println("Invalid Number!");
        }
    }
}