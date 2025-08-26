/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaSequencial;

import java.util.Scanner;

public class Três {
    public static void main(String[] args) {
     /* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a 
     porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
     Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
     escrever um algoritmo para ler o custo de fábrica de um carro, calcular e 
     escrever o custo final ao consumidor.*/
   
     Scanner sc = new Scanner(System.in);
     System.out.printf("Digite o custo de fábrica do carro: ");
     double custoFabrica = sc.nextDouble();
     
     double custoFinal = custoFabrica + ((custoFabrica * 0.28) + (custoFabrica * 0.45));
     System.out.printf("O custo final do seu carro é: %.2f\n", custoFinal);
    }
}
