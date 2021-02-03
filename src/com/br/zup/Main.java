package com.br.zup;

import java.util.Scanner;

public class Main {

    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        Caneta bic = new Caneta();
        Contador calculadora = new Contador();
        bic.escrever("Informe um número");
        calculadora.numero1 = criarScanner().nextInt();
        bic.escrever("Digite um outro número");
        calculadora.numero2 = criarScanner().nextInt();
        bic.escrever("O total da soma é: " + calculadora.somar());
        bic.escrever("O total da subtração do primeiro valor com o segundo é: " + calculadora.subtrair());
        bic.escrever("O total da multiplicação é: " + calculadora.multiplicar());
        bic.escrever("O total da divisão é: " + calculadora.dividir());
    }
}

/*    IO entradaESaida = new IO();
	    Contador calculadora = new Contador();
	    calculadora.primeiraParcela = entradaESaida.pedirUmDado("Digite primeiro numero").nextInt();
	    calculadora.segundaParcela = entradaESaida.pedirUmDado("Pedir segundo dado").nextInt();

	    entradaESaida.saidaDeDados("O valor total da soma é "+calculadora.soma()); */