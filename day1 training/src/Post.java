
public class Post {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String contacts[]= {"john","doe","json"};
			 CreatePosts n=new CreatePosts("sujji",
					 "urgentcallsonly", "8688776188",contacts,
					 "sujji@gmail.com");
			        n.register();
			        System.out.println(n.getname());
			        System.out.println(n.getabout());
			        System.out.println(n.getPhoneno());
			        System.out.println(n.getemail());
			        System.out.println(n.toString());
			        

	}

}
