/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet6prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
import javax.swing.JOptionPane;

public class Tugas1b {
    public static void main(String[] args) {
    int angka1;
    int angka2;
    int angka3;

 
    angka1= Integer.parseInt (JOptionPane.showInputDialog("Masukkan angka1:"));
    angka2= Integer.parseInt (JOptionPane.showInputDialog("Masukkan angka2:"));
    angka3= Integer.parseInt (JOptionPane.showInputDialog("Masukkan angka3:"));
    double hasil=(angka1+angka2+angka3)/3;
    
  
     if(hasil>=60)
     {
         JOptionPane.showMessageDialog(null,"Nilai Rata-Rata Kamu Adalah = \n"+ hasil +" :-)");
     }
     else
        {
         JOptionPane.showMessageDialog(null,"Nilai Rata-Rata Kamu Adalah = \n"+ hasil +" :-)");
            
        }
    }
}