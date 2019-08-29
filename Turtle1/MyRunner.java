/**
 * Write a description of class MyRunner here.
 *
 * @author (Fernando Roriguez)
 * @version (829)
 */
public class MyRunner
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(){
        Turtle   t;

        TurtleDrawingWindow win = new TurtleDrawingWindow();

        int      size, turn;

        t = new Turtle(Turtle.NO_DEFAULT_WINDOW);

        t.jumpTo(0, 0);
        win.add(t);
        win.setVisible(true);
        t.penSize(3);
        size = 200;    //logical units
        turn = 86;    //in degree
        for(int i = 0; i < 120; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
        }
        t.jumpTo(0, 10);
        t.heading(0);
        size     = 200;
        t.penSize(2);
        for(int i = 0; i < 120; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }
    }
}