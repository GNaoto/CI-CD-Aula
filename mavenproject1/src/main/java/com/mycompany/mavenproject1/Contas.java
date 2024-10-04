package com.mycompany.mavenproject1;

class Contas {
    private double n1, n2;
    
    public void  setNumeros(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public double Soma(){
        return n1 + n2;
    }
    public double Subtracao(){
        return n1 - n2;
    }
    public double Multiplicacao(){
        return n1 * n2;
    }
    public double Divisao(){
        if (n2 !=0){
        return n1 / n2;
        }else{
            System.out.println("Erro: Divisão po zero!");
            return Double.NaN;
        }
    }
}
