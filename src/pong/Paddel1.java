/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 692589
 */
 public class Paddel1 extends Character {
    //Fields
 
    //Constructor
   public Paddel1(int x, int y, Color color, int size, String name) {
        super(x, y, Color.WHITE, size, name);
        this.Width = 20;
        this.Height = 50; 
    }
   
}
