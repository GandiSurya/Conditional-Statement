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
public class no3 {
    public static void main(String[] args) {
        
        int orang;
        Scanner kendaraan = new Scanner(System.in);
        System.out.println("masukkan jumlah orang : ");
        orang = kendaraan.nextInt();
        switch(orang){
            case 1 :
                System.out.println("sepeda");
                break;
            case 2-3 :
                System.out.println("motor");
                break;
            case 4-8 :
                System.out.println("mobil");
                break;
            default :
                System.out.println("bus");
        }
    }
}
