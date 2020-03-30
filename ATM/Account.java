// Acount class that contains a name nstance variable
// and a methods to set and get its value

public class Account {
    private String name; // instance variable

    public Account (String name)// constructor name is class name
    {
        this.name = name;
    }

    //Method to set name in the object
    public void setName(String name){
        this.name = name; //store the name 
    }

    //Method to retrieve the name from the object
    public String getName(){
        return name;// return value of name to caller 
    }
}// end of class Account 