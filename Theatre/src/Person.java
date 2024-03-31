public class Person {
    private String Name;
    private String Sur_Name;
    private String Email;

    //main loaded Constructor
    public Person(String name, String sur_Name, String email) {
        Name = name;
        Sur_Name = sur_Name;
        Email = email;
    }
    //Return the name
    public String getName() {
        return Name;
    }
    //Return the surname
    public String getSur_Name() {
        return Sur_Name   ;
    }
    //Return the email
    public String getEmail() {
        return Email;
    }
}


