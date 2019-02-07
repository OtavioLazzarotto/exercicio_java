/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author otavi
 */
public class Atividade01 {

    public static void main(String[] args) {
        String nome;
        double nota1, nota2, nota3, nota4, pesoNota1, pesoNota2, pesoNota3, pesoNota4, somaPeso, media;
        
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        pesoNota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        pesoNota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da segunda nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
        pesoNota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da terceira nota: "));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));
        pesoNota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da quarta nota: "));

        somaPeso = pesoNota1 + pesoNota2 + pesoNota3+pesoNota4;
        media = ((nota1 * pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3) + (nota4 * pesoNota4)) / 10;

        if (somaPeso == 10) {
            if (media >= 7) {
                JOptionPane.showMessageDialog(null, "Aprovado");
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\n"+"Média: "+media);
            } else if (media > 4 && media < 7) {
                JOptionPane.showMessageDialog(null, "Exame");
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\n"+"Média: "+media);
            } else {
                JOptionPane.showMessageDialog(null, "Reprovado");
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\n"+"Média: "+media);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O peso total deve ser igual a 10");
        }
    }

}
