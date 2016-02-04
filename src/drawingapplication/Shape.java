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
public abstract class Shape extends DrawingApplication{
    protected int x;
    protected int y;
    
    public void draw(Graphics g){
        System.out.println("You can't draw an abstract shape.");
    }
    
}
