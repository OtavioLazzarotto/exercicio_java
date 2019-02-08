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
public class Atividade04 {

    /*
    Para calcular o IMC use a seguinte fórmula: IMC = peso / altura². 
    Solicite o nome, o peso e a altura do usuário. Faça o cálculo e apresente o 
    nome do usuário, o cálculo e a descrição do seu IMC correspondente.    
     */
    public static void main(String[] args) {
        String nome, resultado = null;
        double peso, altura, imc;

        nome = JOptionPane.showInputDialog("Digite seu nome? ");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));

        imc = Atividade04.calcularIMC(peso, altura);
        resultado = Atividade04.verificarTipo(imc);

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n"
                + "IMC: " + imc
                + "Resultado: " + resultado);

    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String verificarTipo(Double imc) {
        String resultado = null;

        if (imc < 18.5) {
            resultado = "Peso abaixo do normal";
        } else if (imc >= 18.5 && imc <= 24.4) {
            resultado = "Peso ideal";
        } else if (imc >= 24.5 && imc <= 29.9) {
            resultado = "Pré-obesidade";
        } else if (imc >= 30 && imc <= 34.9) {
            resultado = "Obesidade classe I";
        } else if (imc >= 35 && imc < 39.9) {
            resultado = "Obesidade classe II(severa)";
        } else if (imc >= 40) {
            resultado = "Obesidade classe III(mórbida)";
        }

        return resultado;
    }

}
