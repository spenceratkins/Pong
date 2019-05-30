/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

/**
 *
 * @author 692589
 */
import java.awt.Color;
import java.awt.Graphics;



import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 627997
 */
public class Character {
    private int x;
    private int y;
    private int vx;
    private int vy;
    private Color color;
    private int size;
    private String name;
    int Height;
    int Width;
    
    
    
    public Character(int x, int y, Color color, int size, String name) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
        this.Width = size;
        this.name = name;
        vx = 0;
        vx = 0;
    }    
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getVx() {
        return vx;
    }
    
    public int getVy() {
        return vy;
    }
    
    public Color getColor() {
        return color;
    }
    
    public int getSize() {
        return size;
    }
    
    public String getName() {
        return name;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setVx(int vx) {
        this.vx = vx;
    }   
    
    public void setVy(int vy) {
        this.vy = vy;
    }
      
    public void setColor(Color color) {
        this.color = color;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public void setWidth(int Width) {
        this.Width = Width;
    }
    
       public void move() {
        x += vx;
        y += vy;
    }

   public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, 20, 50);
    }
    public void draw2(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, 10, 10);
    }
    public void draw3(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, 10, 10);
    }

    
   
    
    

    public void move(int vx, int vy) {
        x += vx * 3;
        y += vy * 3;
    }
    
    public void update() {
        move(vx, vy);
    }
    
   
    public void reverseX() {
       
        vx = -vx;
        move(vx, vy); 
    }
    
   
    
    public void reverseY() {
        vy = -vy;
        move (vx, vy);
    }

    
}


