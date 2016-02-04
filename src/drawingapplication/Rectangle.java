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
public class Rectangle extends Shape {
    private int height;
    private int width;
    
    @Override
    public void draw(Graphics g){
        g.drawRect(this.x, this.y, this.width, this.height);
    }
}
