/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcfraiburgo.ExeAula02;

/**
 *
 * @author otavi
 */
public class Atividade01 {
    
    public static void main(String[] args) {
        int[] numeros = {5,4,3,5,10};
        int soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
            
        }
        
        System.out.println("Soma dos numeros inteiros: "+soma);
        
    }
    
}
