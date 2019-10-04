
/**
 * Write a description of class Person here.
 *
 * @author (Fernando Rodriguez)
 * @version (926)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String fName;
    private String mName;
    private String lName;
    private String fullName;
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        String fName = "";
        String mName = "";
        String lName = "";
        String fullName = "";
        //String fName, mName, lName;
    }
    /**
     * 1. "Last, First Middle"
     * 2. "Last, First"
     * 3. "First middle Last"
     * 4. "First Last"
     */
    public void parseName()
    {
        int si = fullName.indexOf(" ");
        int lsi = fullName.lastIndexOf(" ");
        if (fullName.indexOf(",") != -1){//case 1 or 2
          if (si != lsi){//case 1
            int comma = fullName.indexOf(",");
            lName = fullName.substring(0, comma);
            fName = fullName.substring(si+1, lsi);
            mName = fullName.substring(lsi+1);
          }else{//case 2
            int comma = fullName.indexOf(",");
            lName = fullName.substring(0, comma);
            fName = fullName.substring(si+1);
          }
        }else{
          if(fullName.indexOf(",") == -1){//case 3 or 4
            if(si == lsi){//case 3
             fName = fullName.substring(0, si);
             mName = fullName.substring(si+1, lsi);
             fName = fullName.substring(0, si);
            }
          }else{//case 4
            fName = fullName.substring(0, si);
            fName = fullName.substring(0, si);
          }
        }
        fName = ("First Name " + fName);
        mName = ("First Name " + mName);
        lName = ("First Name " + lName);
        fullName = (fName+mName+lName);
        System.out.print(fullName);
    }
}

//case of 3
//fName = fullName.substring(0, si);
//mName = fullName.substring(si+1, lsi);
//lName = fullName.substring(lsi+1);