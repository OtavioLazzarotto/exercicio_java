/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcfraiburgo.aula02;

/**
 *
 * @author otavi
 */
public class ArrayExemplo01 {
    
    public static void main(String[] args) {
        String[] semana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
        
        for (int i = 0; i < semana.length; i++) {
            System.out.println(i+ " - "+ semana[i]);
        }
        
        System.out.println("CRESCENTE");
        for (int i = 0; i < semana.length; i++) {
             System.out.println(i+ " - "+ semana[i]);
        }
        
        System.out.println("DECRESCENTE");
        for (int i = semana.length-1; i >= 0; i--) {
             System.out.println(i+ " - "+ semana[i]);
        }
        
    }
    
}
