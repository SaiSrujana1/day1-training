import java.util.Arrays;

public class CreatePosts {
	
	String name;
    String About;
    String Phoneno;
 String contacts[]=new String[3];  
    String email; 
 
   
    
    public CreatePosts()
    {
     
    }
    public CreatePosts(String name, String about, String phoneno,
      String[] contacts, String email) {
  this.name = name;
  About = about;
  Phoneno = phoneno;
  this.contacts = contacts;
  this.email = email;
 }
  
  public String getname(){
     return name;
   }
   public String getabout(){
       return About;
  }
   public String getPhoneno(){
   return Phoneno;
   }
   public String getemail(){
     return email;
    }


   public void register()
     {
      System.out.print("phone no: ");
      System.out.println(Phoneno);
      
     }
  
 @Override
 public String toString() {
  return "CreatePosts [name=" + name + ", About=" + About + ", Phoneno=" + Phoneno + ", contacts="
    + Arrays.toString(contacts) + ", email=" + email + "]";
 }
   
     
    
	



}

