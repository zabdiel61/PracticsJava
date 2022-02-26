/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo;

import java.util.Scanner;

/**
 *
 * @author zabdiel
 */
public class LecturaConsola {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter your name: ");
        var name = reader.nextLine();
        System.out.println("enter your age: ");
        var age = reader.nextLine();
        
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
    }
    
}
