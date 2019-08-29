/**
 * Write a description of class TurtleRunner here.
 *
 * @author (EEttlin)
 * @version (827)
 */
import java.awt.*;
public class TR2
{
    public static void main(){

        Turtle   t;

        TurtleDrawingWindow win = new TurtleDrawingWindow();

        int      size, turn;

        t = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        t.jumpTo(0, 0);
        win.add(t);
        win.setVisible(true);
        t.penSize(8);

        t.penColor(Color.red);
        for(int i = 0; i < 100; i++){
            
            int x = (int)(Math.random()*1000-500);
            int y = (int)(Math.random()*1000-500);
            t.jumpTo(x,y); 
            if(x>y+8){
                t.penColor(Color.red);
            }else if(x < y-8){
                t.penColor(Color.green);
            }else{
                t.penColor(Color.black);
            }
            t.penDown( );
            t.move(3);
            t.penUp( );
            String n = "("+x + ", " + y + ")";
            t.print(n);
        }
        
        
        t.hide();

    }
}
