
/**
 * Write a description of class Person here.
 *
 * @author (Fernando Rodriguez)
 * @version (926)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String fName = "";
    private String mName = "";
    private String lName = "";
    private String fullName = "";
    
    
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        fName = "";
        mName = "";
        lName = "";
        fullName = "";
        //String fName, mName, lName;
    }
    //RunnerClass so = new RunnerClass();
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String parseName(String fullName, String fName, String mName, String lName)
    {
        // put your code here
        String str = "Bob Smith";
        if (fullName.indexOf(",") == -1){
          int si = str.indexOf(",");
          fName = str.substring(0, si);
          fullName = fullName.substring(si);
        }
        return fullName;
        
    }
}











//String str = "Bob Smith";
        //int si = str.indexOf(" ");
        //fName = str.substring(0,si);
        //return fullName;