/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.security.MessageDigest;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author otavi
 */
public class Atividade06 {

    public static void main(String[] args) {

        try {
            String usuario, senha, crip;

            usuario = JOptionPane.showInputDialog("Digite o usuario: ");
            senha = JOptionPane.showInputDialog("Digite a senha: ");
            crip = Atividade06.criptografar(senha);
            Atividade06.verificarLogin(usuario, crip);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static String criptografar(String senha) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(senha.getBytes());
        return DatatypeConverter.printHexBinary(md.digest()).toUpperCase();
    }
    
    public static void verificarLogin(String usuario, String crip) throws Exception {
        String senha = Atividade06.criptografar("ifcfraiburgo");
        if(usuario.equals("aluno") && crip.equals(senha)) {
            JOptionPane.showMessageDialog(null, "Seja bem vindo aluno!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
        }
    }

}
