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
public class no5 {
    public static void main(String[] args) {
        
        int umur;
        Scanner film = new Scanner(System.in);
        System.out.println("masukkan umur : ");
        umur = film.nextInt();
        switch(umur){
            case 6-17 :
                System.out.println("nonton film anak-anak");
                break;
            case 18-100 :
                System.out.println("nonton film dewasa");
                break;
            default :
                System.out.println("tidak boleh nonton film");
        }
    }
}
