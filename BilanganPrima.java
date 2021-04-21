
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agnes m
 */
public class BilanganPrima {
    public static void main(String args[]) {
        System.out.println("Program untuk menampilkan bilangan prima");
        
        Scanner a = new Scanner(System.in);
        int n, i, j;
        
        System.out.print("Masukkan nilai n : ");
        n = a.nextInt();
        
        System.out.print("Bilangan prima 1 - " + n + " = ");
        for(i = 1; i <= n; i++) {
            int c = 0;
            for(j = 1; j <= n; j++){
                if(i % j ==  0){
                    c++;
                }
            }
            if((c == 2) && (n != 1)){
                System.out.print(i + " ");
            }
        }
    }
        
        
    }
}
