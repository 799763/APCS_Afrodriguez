
/**
 * Write a description of class MazeWalker here.
 *
 * @author (Fernando Rodriguez)
 * @version (3 Sept. 2019)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    public static void run (){
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void walkMaze(Maze maze, MazeBot mazeBot)
    {
        // your instructions go here   
        while(mazeBot.canMoveForward() ==true){
            mazeBot.moveForward();
            int test =(int) (Math.random() *2);
            while(mazeBot.canMoveForward()==false){
                if(test==0){
                    mazeBot.turnRight();
                }
                if(test==1){
                    mazeBot.turnLeft();
                }
            }
        }
        if (mazeBot.didReachGoal() == true){
            mazeBot.signalSuccess();

        }    
        else{
            mazeBot.signalError();

        }
    }
}