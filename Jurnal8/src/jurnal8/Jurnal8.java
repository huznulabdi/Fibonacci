/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal8;

import static com.sun.deploy.uitoolkit.impl.fx.ui.MixedCodeInSwing.show;
import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =  new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci : ");
        int n = sc.nextInt();
        long fibonacci[] = new long[n];
        int hasil= 0;
         
        fibonacci[0] = 1;
        fibonacci[1] = 1;
      
         
        for(int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            hasil+=fibonacci[i];
            
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] +  " ");
        }
        System.out.println("");
        System.out.println("Hasil penjumlahan : "+hasil);
        
    }
    
}
