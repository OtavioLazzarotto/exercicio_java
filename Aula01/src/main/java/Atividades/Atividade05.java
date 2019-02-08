/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import javax.swing.JOptionPane;

/**
 *
 * @author otavi
 */
public class Atividade05 {

    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
        
        int soma = num1+num2;
        int sub = num1-num2;
        int divisao = num1/num2;
        int mult = num1*num2;
        
        JOptionPane.showMessageDialog(null, "Resultado: "+
                "Soma: "+soma+
                "Subtração: "+sub+
                "Divisão: "+divisao+
                "Multiplicação: " +mult);
    }

}
