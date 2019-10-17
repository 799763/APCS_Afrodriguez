/**
 * 
 *
 * @author (Fernando Rodriguez)
 * @version (926)
 */
public class Person
{
    private String fName;
    private String mName;
    private String lName;
    //Constructor
    public Person(String fullName)
    {
        parseName(fullName);
        //Allows "fullName" to be sen all over the code not just these "{ and }"
    }
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