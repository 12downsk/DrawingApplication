/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingapplication;
import java.util.LinkedList;
/**
 *
 * @author 12dow_000
 */
public class Controller {
    private LinkedList<Drawable> rectangle = new LinkedList<Drawable>();
    private LinkedList<Drawable> ellipse = new LinkedList<Drawable>();
    
    public Rectangle addRectangle(double width, double height){
        Rectangle r = new Rectangle(10,10,width,height);
        return r;
    }
    
    public Ellipse addEllipse(double width, double height){
        Ellipse e = new Ellipse(10,10,width,height);
        return e;
    }
    
    
}
