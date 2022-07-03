/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasstack;

import java.util.Scanner;
import java.util.Stack;
public class TugasStack {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kata: ");
        
        String balikan = "";         //variable balikan untuk tulisan pada output
        String u = input.nextLine(); //variable u untuk kata yang dimasukkan
        Stack t = new Stack();   // variable t untuk stack
      
        //Proses
        for (int a = 0; a < u.length(); a++){ 
            t.push(u.charAt(a)); //fungsi .push berguna untuk memasukkan inputan dari array ke Stack menggunakan variable t
        }
        while (!t.isEmpty()){
            balikan += t.pop(); //fungsi .pop berguna untuk mengeluarkan isi dalam Stack yang di tampung oleh variable t
        }
        //output
        System.out.println("Hasil Kata: " +balikan);
        }
               
    }
    

