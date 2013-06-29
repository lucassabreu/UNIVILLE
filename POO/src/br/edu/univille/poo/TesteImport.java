package br.edu.univille.poo;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TesteImport {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                        | IllegalAccessException
                        | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        Date agora = new Date();

        SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

        System.out.println(sdfDate.format(agora));
        System.out.println(sdfTime.format(agora));

        JOptionPane.showMessageDialog(null, String.format("%s %s", sdfDate
                        .format(agora), sdfTime.format(agora)));

        String retorno = JOptionPane.showInputDialog("Qual seu nome?");

        JOptionPane.showMessageDialog(null, String
                        .format("Seu nome eh %s", retorno));

        retorno = JOptionPane.showInputDialog("Informe uma Data:");
        
        try {
            JOptionPane.showMessageDialog(null, sdfDate.parse(retorno));
        } catch (HeadlessException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
