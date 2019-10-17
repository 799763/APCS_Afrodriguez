
/**
 * Write a description of class MyFirstProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyFirstProgram
{
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
    }
}
