/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Muhammad Fitrayana
 */
public class Tabungan {
    
   Scanner baca = new Scanner(System.in);
   private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
   
    public int ambilUang(int jumlah) {
        
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlah = baca.nextInt();
     
    return saldo - jumlah;
       
   }
    
}
