/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcfraiburgo.ExeAula02;

import javax.swing.JOptionPane;

/**
 *
 * @author otavi
 */
public class Atividade03 {

    /**
     * Crie um array unidimensional com cinco números inteiros e: Utilizando
     * JOptionPane, solicite ao usuário um número, verifique se este número
     * existe ou não no array. Se encontrar o número, informe ao usuário qual
     * posição do array encontra-se o número Caso contrário, informe que o
     * número não encontra-se no array
     *
     *
     */
    public static void main(String[] args) {
        Integer[] numeros = {1, 5, 4, 9, 8};
        Integer numUsuario, posicao=0;
        String erro = null;

        numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        for (int i = 0; i < numeros.length; i++) {

            if (numUsuario == numeros[i]) {
                posicao = i;
            } else {
                
            }
        }
        
        System.out.println("Posição do numero do Array: "+posicao);
    }

}
