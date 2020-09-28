import java.lang.*;
public class Author {
    private String Name;
    private String Email;
    private char Gender;

    public Author(String Name, String Email, char Gender){
        this.Name = Name;
        this.Email = Email;
        this.Gender = Gender;
    }
    public String getName(){
        return Name;
    }
    public String getEmail(){
        return Email;
    }
    public char getGender(){
        return Gender;
    }
    public void setEmail(String email){
        this.Email = Email;
    }
    public String toString(){
        return "Author name:" + Name + " Email:" + Email + " Gender:" + Gender;
    }
}
