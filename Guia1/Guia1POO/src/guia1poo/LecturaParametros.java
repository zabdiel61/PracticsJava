/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo;

/**
 *
 * @author zabdiel
 */
public class LecturaParametros {
    public static void main(String[] args) {
        
        args = new String[2];
        
        if (args.length >= 0) {
            System.out.println("parameter 1: " + args[0]);
            System.out.println("parameter 2: " + args[1]);
        } else {
            System.out.println("el arreglo no esta instanceado");
        }
    }
}
