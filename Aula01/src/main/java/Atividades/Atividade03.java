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
public class Atividade03 {
    
    public static void main(String[] args) {
        double saldo = 0;
        double valor;
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
        
        saldo = saldo + valor;
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja retirar: "));
        saldo-=valor;
        
        JOptionPane.showMessageDialog(null, "Saldo da conta: "+saldo);
    }
    
}
