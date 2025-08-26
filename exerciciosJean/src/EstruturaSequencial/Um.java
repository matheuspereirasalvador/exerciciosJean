/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaSequencial;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        //Fazer um algoritmo que leia um número inteiro e escreva o seu antecessor e o seu sucessor. 
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número:");
        int num = sc.nextInt();
        
        System.out.printf("Antecessor: %d\n", num - 1);
        System.out.printf("Sucessor: %d\n", num + 1);
        sc.close();
    }
}
