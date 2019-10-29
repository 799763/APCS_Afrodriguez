/**
 * 
 *
 * @author (Fernando Rodriguez)
 * @version (926)
 */
public class Person
{
    <<<<<<< HEAD
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
                System.out.println("First Name " + fName);
                System.out.println("Middle Name " + mName);
                System.out.println("Last Name " + lName);
                System.out.println(fullName);
            }
        }