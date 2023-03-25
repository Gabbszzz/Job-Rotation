package questao2;

import java.util.Scanner;

/**
 *
 * @author @Gabbszzz
 */

public class Fibonacci {

    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
        
        // Termo1(0) , Termo2(1), Termo3(0)
        int t1 = 0, t2 = 1, t3 =0;
        
        System.out.println('_'*30);
        System.out.println('_'*3 + "Sequência de Fibonacci");
        System.out.println('_'*30);
        
        int valor = result.nextInt();
        
        System.out.println("Digite um número:: " + valor); 
        
        while (valor > t3){
        t3 = t1 + t2;
        t1 = t2;
        t2 = t3;
        
        if(valor==0|| valor==1){
            System.out.println("O número faz parte da sequência de Fibonacci.");
        }else if(valor==t3){
            System.out.println("O número faz parte da sequência de Fibonacci.");
        }else{
            System.out.println("O número digitado não faz parte da sequência de Fibonacci.");
        }
    } 
}
}