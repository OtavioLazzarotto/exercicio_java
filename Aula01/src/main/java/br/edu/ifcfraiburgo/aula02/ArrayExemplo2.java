/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcfraiburgo.aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author otavi
 */
public class ArrayExemplo2 {

    public static void main(String[] args) {
        String auxiliar = null;
        int quantidade;
        Double[] notas;

        auxiliar = JOptionPane.showInputDialog("Informe a quantidade notas: ");
        quantidade = Integer.parseInt(auxiliar);
        notas = new Double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota " + i));
        }

        System.out.println(notas.length);
        //Somar notas (JAVA 8)
        System.out.println(somarNotas(notas));
        //Média das notas (JAVA 8)
        System.out.println(calcularMediaNotas(notas));
        
        //Não ordenadas
        System.out.println(java.util.Arrays.asList(notas));
        
        //Ordenado
        java.util.Arrays.sort(notas);
        System.out.println(" ");
    }

    public static Double somarNotas(Double notas[]) {
        return java.util.Arrays.stream(notas).mapToDouble(Double::doubleValue).sum();
    }

    public static Double calcularMediaNotas(Double notas[]) {
        return java.util.Arrays.stream(notas).mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
    }
    


}
