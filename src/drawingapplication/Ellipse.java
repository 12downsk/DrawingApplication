/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingapplication;
import java.awt.Graphics;
/**
 *
 * @author 12dow_000
 */
public class Ellipse extends Shape {
    private double height;
    private double width;
    
    @Override
    public void draw(Graphics g){
        g.drawOval((int)this.x, (int)this.y, (int)this.width, (int)this.height);
        
    }
    
    public Ellipse(double x, double y, double width, double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
}
