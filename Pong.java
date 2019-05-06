/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author 692589
 */
public class Pong extends JFrame {
 private final static int WIDTH = 700, HEIGHT = 450;
 private PongPanel panel; 
 
 public Pong(){ 
     setSize (WIDTH, HEIGHT);
     setBackground(Color.BLACK);
     panel = new PongPanel(this);
    
 }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
