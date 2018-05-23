/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hectorcanalessv;



/**
 *
 * @author estudiante
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorx =10,espacio=10,ancho=50;
        while(valorx<=600){
            valorx= valorx+espacio+ancho;
            System.out.println(valorx);
        }
    }
    
}
