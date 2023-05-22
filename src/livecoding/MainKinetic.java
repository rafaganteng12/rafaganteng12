/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding;

import java.util.Scanner;

/**
 *
 * @author Muhammad Rafa Ruchmadiananta-22104410061-Teknik
 * informatika-Universitas Islam Balitar
 */
public class MainKinetic {

    public double massa, kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    //Fungsi Menghitung
    public double hitung(){
        return 0.5*massa*Math.pow(kecepatan,2);
    }
    
    public static void main(String[] args) {
        
        MainKinetic kinetik = new MainKinetic();
        
        System.out.println("Masukkan Massa : ");
        Scanner varMassa = new Scanner(System.in);
        System.out.println("Masukkan kecepatan Benda : ");
        Scanner varKecepatan = new Scanner(System.in);
        
        kinetik.setMassa(varMassa.nextDouble());
        kinetik.setKecepatan(varKecepatan.nextDouble());
        
        
        System.out.println(kinetik.hitung());
    }
    
}

