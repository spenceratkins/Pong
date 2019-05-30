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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class PongPanel extends JPanel  {
private Ball ball;
private Paddel1 paddel1;
private Paddel2 paddel2; 
   private Timer timer;

    public PongPanel() {
    super();
    

    paddel1 = new Paddel1(630, 150, Color.CYAN, 50, "Paddle");
    paddel2 = new Paddel2(30, 150, Color.CYAN, 50, "Paddle");
    ball = new Ball(350 ,225, Color.RED, 20, "ball");
    ball.setVx(1);
    ball.setVy(1);

       
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000 / 70);
    }

    

   
    @Override
 public void paintComponent(Graphics g){
     super.paintComponent(g); 
     this.setBackground(Color.BLACK);
      ball.draw(g);
      paddel1.draw(g);
      paddel2.draw(g);
      
     
    }
     private class ScheduleTask extends TimerTask {

        public void run() {
           ball.update();
       paddel1.update();
       paddel2.update();
       wallCollisions(ball);
       characterVsCharacter((Ball)ball,paddel1);
       characterVsCharacter((Ball)ball,paddel2);
        repaint();
        }
     
    }
  //PongPanel Uses Pong(){
      
  //}
  
   private void wallCollisions(Character c) {
               if (c.getX() <= 0 || c.getX() + 30 >=700){
            c.setVx(-c.getVx());
            c.move();
        }
               if (c.getY() <= 0 || c.getY() + 30 >=450){
            c.setVy(-c.getVy());
            c.move();
        }
    }
   
private void characterVsCharacter(Ball c1, Paddel1 c2) {
        if (c1.getX() + c1.getWidth() > c2.getX() 
        && c1.getX() < c2.getX() + c2.getWidth() 
        && c1.getY() + c1.getHeight() > c2.getY()
        && c1.getY() < c2.getY() + c2.getHeight() ) {
        c1.setVx(-c1.getVx());
    c1.move();
        }

    }
private void characterVsCharacter(Ball c1, Paddel2 c2) {
       if (c1.getX() + c1.getWidth() > c2.getX() 
        && c1.getX() < c2.getX() + c2.getWidth() 
        && c1.getY() + c1.getHeight() > c2.getY()
        && c1.getY() < c2.getY() + c2.getHeight() ) {
        c1.setVx(-c1.getVx());
        c1.move();
        }

    }


   
   
   public void keyPressed(KeyEvent e) {
        final int SPEED = 2;
      
         if (e.getKeyCode() == KeyEvent.VK_UP) {
            paddel1.setVy(-SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            paddel1.setVy(SPEED);
        }
    }
    
    public void keyReleased(KeyEvent e) {
       
            
        if (e.getKeyCode() == KeyEvent.VK_UP)
           paddel1.setVy(0);
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
           paddel1.setVy(0);
          
    }
 //public void keyPressed(KeyEvent f) {
     //   final int SPEED = 1;
      
      //   if (f.getKeyCode() == KeyEvent.VK_W) {
           // paddel2.setVy(-SPEED);
       // }
      //  else if (f.getKeyCode() == KeyEvent.VK_S) {
       //   paddel2.setVy(SPEED);
      //  }
    }
    
    //public void keyReleased(KeyEvent f) {
       
            
      // if (f.getKeyCode() == KeyEvent.VK_W)
          // paddel2.setVy(0);
            
       // if (f.getKeyCode() == KeyEvent.VK_S)
        //   paddel2.setVy(0);
          
   


  
//}