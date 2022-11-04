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
public class no1 {
    public static void main(String[] args) {
        int Nilai;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai = ");
        Nilai = input.nextInt();
        if (Nilai>=90){
            System.out.println("Nilai A");
        }
        else if (Nilai>=80){
            System.out.println("Nilai B");
        }
        else if  (Nilai>=70){
            System.out.println("Nilai C");
        }
        else if (Nilai>=60) {
            System.out.println("Nilai D");
        }
        else {
            System.out.println("Nilai E");
        }
    }
}
