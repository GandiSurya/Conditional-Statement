/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatment;

import java.util.Scanner;

/**
 *
 * @author LK5_8
 */
public class no2 {
    public static void main(String[] args) {
        int totalbelanja;
        int diskon;
        int bayar;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total belanja = ");
        totalbelanja = input.nextInt();
        if (totalbelanja>=500000){
            diskon = 75000;
        }
        else if (totalbelanja>=300000){
            diskon = 50000;
        }
        else if (totalbelanja>=150000){
            diskon = 20000;
        }
        else if (totalbelanja>=100000){
            diskon = 10000;
        }
        else {
            diskon = 0;
        }
        bayar = totalbelanja - diskon;
        System.out.println(bayar);
        
    }
}
