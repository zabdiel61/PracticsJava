/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complementarios;

import javax.swing.JOptionPane;

/**
 *
 * @author zabdiel
 */
public class InformacionBasicaJO {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido", "Informacion Basica", JOptionPane.INFORMATION_MESSAGE);

        var name = JOptionPane.showInputDialog("type your name: ");
        var lastName = JOptionPane.showInputDialog("type your last name: ");
        var age = Integer.parseInt(JOptionPane.showInputDialog("type your age: "));
        var career = JOptionPane.showInputDialog("tyoe your career");

        JOptionPane.showMessageDialog(null, "your name is: " + name
                + "\nyour lastname is: " + lastName
                + "\nyour age is: " + age
                + "\nyour career is: " + career,
                "your information", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
