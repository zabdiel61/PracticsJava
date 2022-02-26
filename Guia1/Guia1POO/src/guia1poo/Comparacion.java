/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo;

import javax.swing.JOptionPane;

/**
 *
 * @author zabdiel
 */
public class Comparacion {
    public static void main(String[] args) {
        var firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Write the first Integer"));
        var secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Write the second Integer"));
        
        var result = "";
        
        if (firstNumber == secondNumber) {
            result = result + firstNumber + " == " + secondNumber;
        }
        if (firstNumber != secondNumber) {
            result = firstNumber + " != " + secondNumber;
        }
        if (firstNumber < secondNumber) {
            result =  firstNumber + " < " + secondNumber;
        }
        if (firstNumber > secondNumber) {
            result = firstNumber + " > " + secondNumber;
        }
        
        JOptionPane.showMessageDialog(null, result, "Result the comparation", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
