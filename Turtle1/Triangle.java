
/**
 * Write a description of class TurtleRunner here.
 *
 * @author (EEttlin)
 * @version (827)
 */
import java.awt.Color;
public class Triangle{
    public static void main(){
        Turtle   t = new Turtle(Turtle.NO_DEFAULT_WINDOW);//  create a Turtle object;
        TurtleDrawingWindow win = new TurtleDrawingWindow();//  create a TurtleDrawingWindow object;
        int      size, turn;
      
        t.jumpTo(-150, 0);
        win.add(t);// add the turtle object to ayour window object
        win.setVisible(true);
        
        t.penSize(15);
        size     = 300;    //logical units
        turn     = 120;    //in degrees
        t.penColor(Color.red); //import java.awt.Color to make this work
        //+++++++++++++++++++++++++++++
        t.move( size ); 
        t.turn( turn );
        String n = "First Turn";
        t.print(n);
        //+++++++++++++++++++++++++++++
        t.move( size ); 
        t.turn( turn );
        n = "Second Turn";
        t.print(n);
        //+++++++++++++++++++++++++++++
        t.move( size ); 
        t.turn( turn );
        n = "Third Turn";
        t.print(n);
        t.hide();
    }
}
