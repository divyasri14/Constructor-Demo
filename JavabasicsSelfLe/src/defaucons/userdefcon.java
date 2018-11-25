package defaucons;

public class userdefcon {
	int id;
	String name;
	String grade;
	
	userdefcon()
	{
		id =1;
		name = "divya";
		grade ="A";

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userdefcon s = new userdefcon();	
				
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.grade);
		userdefcon s1 = new userdefcon();
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.grade);
		

	}

}
