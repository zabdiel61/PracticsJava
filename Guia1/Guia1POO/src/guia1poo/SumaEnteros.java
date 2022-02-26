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
public class SumaEnteros {

    public static void main(String[] args) {
//        if (firstNumber == secondNumber) {
//            JOptionPane.showMessageDialog(null, "The sume is neutral", "type", JOptionPane.INFORMATION_MESSAGE);
//        }

        var firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Type de first number: "));
        if (firstNumber < 0) {
            JOptionPane.showMessageDialog(null, "you cannot enter negative numbers", "WARNING", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        var secondNumber = Integer.parseInt(JOptionPane.showInputDialog("type second number: "));
        if (secondNumber < 0) {
            JOptionPane.showMessageDialog(null, "you cannot enter negative numbers", "WARNING", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        
        var suma = firstNumber + secondNumber;
        JOptionPane.showMessageDialog(null, "The sum is: " + suma, "Result", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
