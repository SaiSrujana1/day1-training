
public class CreateContacts {

	public static void main(String[] args) {
		
	    Contact con1 = new Contact();
	    
	    
	    System.out.println(con1.contactId);
		System.out.println(con1.firstName);
		System.out.println(con1.mobileNo);
		System.out.println(con1.email);
		System.out.println(con1.company);

	    
	    con1.contactId=1;
		con1.firstName="sujji";
	    con1.mobileNo=8688776188L;
		con1.email="sujji@gmail.com";
		con1.company="jobiak";
			
      
		System.out.println(con1.contactId);
		System.out.println(con1.firstName);
		System.out.println(con1.mobileNo);
		System.out.println(con1.email);
		System.out.println(con1.company);


	}

}
