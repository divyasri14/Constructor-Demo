package defaucons;

public class parametrisecon {
	int id;
	String name;
	String grade;
	parametrisecon (int i,String n,String g)
	{
		id = i;
		name = n;
		grade = g;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 parametrisecon s = new parametrisecon(1,"abc","a");
		 System.out.println(s.id);
		 System.out.println(s.name);
		 System.out.println(s.grade);
		 parametrisecon s1 = new parametrisecon(1,"ABC","B	");
		 System.out.println(s1.id);
		 System.out.println(s1.name);
		 System.out.println(s1.grade);
	}
	

}
