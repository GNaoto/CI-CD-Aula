
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
      
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("[1]-SOMA / [2]-SUBTRAÇÃo / [3]-MULTIPLICÃO / [4]-DIVISÃO / [5]-SAIR");
        
        int opcao = entrada.nextInt();
        
        Calculadora cal = new Calculadora();
        double n1, n2;
        while(opcao !=5)
            if (opcao == 1){
                System.out.println("Digite o primeiro numero: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero: ");
                n2 = entrada.nextDouble();
                cal.setNumeros(n1, n2);
                System.out.println("SOMA = "+cal.Soma());
            }else if (opcao == 2){
                System.out.println("Digite o primeiro numero: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero: ");
                n2 = entrada.nextDouble();
                cal.setNumeros(n1, n2);
                System.out.println("SUBTRAÇÃO = "+cal.Subtração());
            }else if (opcao == 3){
                System.out.println("Digite o primeiro numero: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero: ");
                n2 = entrada.nextDouble();
                cal.setNumeros(n1, n2);
                System.out.println("MULTIPLICAÇÃO = "+cal.Multiplicação());
            }else if (opcao == 4){
                System.out.println("Digite o primeiro numero: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero: ");
                n2 = entrada.nextDouble();
                cal.setNumeros(n1, n2);
                System.out.println("DIVISÃO = "+cal.Divisão());
            }else{
                System.out.println("Opção invalida!");                
            }
        System.out.println("[1]-SOMA / [2]-SUBTRAÇÃo / [3]-MULTIPLICÃO / [4]-DIVISÃO / [5]-SAIR");
        opcao = entrada.nextInt();

    }
    

    private void setNumeros(double n1, double n2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String Soma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String Subtração() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String Multiplicação() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String Divisão() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

