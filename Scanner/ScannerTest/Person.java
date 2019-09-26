
/**
 * 
 *
 * @author (Fernando Rodriguez)
 * @version (926)
 */
public class Person
{
    
    /**
     * Constructor for objects of class Person
     */
    
    
    private String fName;
    private String mName;
    private String lName;
    
    //Constructor
    public Person(String fullName)
    {
        parseName(fullName);
        //Allows "fullName" to be sen all over the code not just these "{ and }"
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String parseName(String fullName)
    {
        // put your code here
        
        if (fullName.indexOf(",") == -1){
          int si = fullName.indexOf(",");
          fName = fullName.substring(0, si);
          
          
        }
        return fullName;
    }
}











//String str = "Bob Smith";
        //int si = str.indexOf(" ");
        //fName = str.substring(0,si);
        //return fullName;