/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaSequencial;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        //Ler uma medida em polegadas e imprimir a equivalente em centímetros, sabendo que 2.54 cm equivale a 1 polegada. 
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite uma medida em polegadas: ");
        double polegadas = sc.nextDouble();
        System.out.printf("A sua medida em centímetros é: %.2f\n", polegadas * 2.54);
    }
}
