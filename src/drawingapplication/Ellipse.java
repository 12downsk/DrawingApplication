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
    int height;
    int width;
    
    public void draw(Graphics g){
        g.drawOval(this.x, this.y, this.width, this.height);
    }
}
