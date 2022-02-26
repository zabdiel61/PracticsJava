/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complementarios;

import java.util.Scanner;

/**
 *
 * @author zabdiel
 */
public class InformacionBasica {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("type your name: ");
        var name = reader.nextLine();
        System.out.println("type your last name: ");
        var lastName = reader.nextLine();
        System.out.println("type your age: ");
        var age = reader.nextLine();
        System.out.println("type your career: ");
        var career = reader.nextLine();
        
        System.out.println("your name is: " + name);
        System.out.println("lastName = " + lastName);
        System.out.println("age = " + age);
        System.out.println("career = " + career);
    }
}
