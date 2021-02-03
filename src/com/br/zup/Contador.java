package com.br.zup;

public class Contador {
    int numero1;
    int numero2;

    public int somar(){
        int total = numero1 + numero2;
        return total;
    }

    public int subtrair(){
        if(new Validador().validarSubtracao(numero1, numero2)){
            return numero1 - numero2;
        }
        return numero2 - numero1;


    }

    public int multiplicar(){
       return numero1 * numero2;
    }

    public int dividir(){
        int total = numero1 / numero2;
        return total;
    }
}
