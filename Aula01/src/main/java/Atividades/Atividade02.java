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
public class Atividade02 {
    
    public static void main(String[] args) {
        double base, altura;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
        
        JOptionPane.showMessageDialog(null, "Valor da Aréa do triangulo: "+base*altura);
    }
    
}
