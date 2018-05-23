/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hectorcanalessv.GUI;

import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author estudiante
 */
public class GUI extends JFrame{
    private int WIDTH= 600, HEIGHT=900;
    private int widthBT=50, heightBT=widthBT/2;
    
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btDIV,btPlus,btMult,btRes,btEqual,btBina;
    JTextField pantalla;

    public GUI(){
        bt0= new JButton("0");
        bt1= new JButton("1");
        bt2= new JButton("2");
        bt3= new JButton("3");
        bt4= new JButton("4");
        bt5= new JButton("5");
        bt6= new JButton("6");
        bt7= new JButton("7");
        bt8= new JButton("8");
        bt9= new JButton("9");
        btDIV= new JButton("/");
        btPlus= new JButton("+");
        btMult= new JButton("*");
        btRes= new JButton("-");
        btEqual= new JButton("=");
        btBina= new JButton("BINARY");
        pantalla = new JTextField();
        
        bt0.setBounds(10, 70, widthBT, heightBT);
        bt1.setBounds(70, 70, widthBT, heightBT);
        bt2.setBounds(130, 70, widthBT, heightBT);
        bt3.setBounds(10, 70, widthBT, heightBT);
        bt4.setBounds(70, 70, widthBT, heightBT);
        bt5.setBounds(130, 70, widthBT, heightBT);
        bt6.setBounds(10, 70, widthBT, heightBT);
        bt7.setBounds(70, 70, widthBT, heightBT);
        bt8.setBounds(130, 70, widthBT, heightBT);
        bt9.setBounds(10, 70, widthBT, heightBT);
        
        
    }
    
    
    
    
}
