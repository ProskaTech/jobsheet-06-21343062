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

public class Tugas2a {
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

        if (i == 1){
            System.out.println("Satu");
        }
        else if (i == 2){
            System.out.println("Dua");
        }
        else if (i == 3){
            System.out.println("Tiga");
        }
        else if (i == 4){
            System.out.println("Empat");
        }
        else if (i == 5){
            System.out.println("Lima");
        }
        else if (i == 6){
            System.out.println("Enam");
        }
        else if (i == 7){
            System.out.println("Tujuh");
        }
        else if (i == 8){
            System.out.println("Delapan");
        }
        else if (i == 9){
            System.out.println("Sembilan");
        }
        else if (i == 10){
            System.out.println("Sepuluh");
        }
        else {
            System.out.println("Invalid Number!");
        }
    }
}