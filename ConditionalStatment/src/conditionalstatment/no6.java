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
public class no6 {
    public static void main(String[] args) {
        
        int buku;
        int diskon;
        int bayar;
        int total;
        Scanner total = new Scanner(System.in);
        System.out.println("masukkan umur : ");
        buku = total.nextInt();
        switch(buku){
            case 1 :
                diskon = 0;

            case 2 :
                diskon = 0;
            
            case 3 :
                diskon = 0;
    
            case 4 :
                diskon = 0;
  
            case 5 :
                diskon = 5/100;
     
            case 10 :
                diskon = 10/100;
       
            default :
                System.out.println("input tidak valid");
            bayar = total - diskon;
        }
    }
}
