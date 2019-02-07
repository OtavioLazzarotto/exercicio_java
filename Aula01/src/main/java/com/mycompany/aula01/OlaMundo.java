/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula01;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Otavio
 * @since 1.0
 * @version 1.0
 */
public class OlaMundo {

    public static void main(String[] args) {
        String nome;
        double n1, n2, trabalho, media;

        try {

            nome = JOptionPane.showInputDialog("Informe seu nome: ");
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
            trabalho = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do trabalho: "));
            media = (n1 + n2 + trabalho) / 3;

            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n"
                    + "Media: " + media);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão dos números!",
                    "Infomre números validos!", TrayIcon.MessageType.ERROR.ordinal());
            ex.printStackTrace();
            
        } finally {
            System.out.println("Saindo...");
            System.exit(0);
        }
    }

}
