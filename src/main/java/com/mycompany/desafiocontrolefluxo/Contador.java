package com.mycompany.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro valor");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o valor do segunfo valor");
        int segundoNumero = sc.nextInt();
        try {
            contar(primeiroNumero,segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    public static void contar(int primeiroNumero,int segundoNumero) throws ParametrosInvalidosException{
        
        if(primeiroNumero> segundoNumero){
            throw new ParametrosInvalidosException("Valor dos parâmentros inválido.\nInsirá um valor válido.");
        }
        
        int contador = segundoNumero-primeiroNumero;
        
        for(int i = 0; i<contador;i++){
            System.out.println((i+1)+"° interação");
        }
        System.out.println("Houve um total de "+contador+" interações");
        
    }
}
