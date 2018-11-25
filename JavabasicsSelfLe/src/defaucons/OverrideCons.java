package defaucons;

public class OverrideCons {
		int id;
		String name;
		String grade;
		OverrideCons (int i,String n,String g)
		{
			id = i;
			name = n;
			grade = g;
		}
		OverrideCons (int i,String n)
		{
			id = i;
			name = n;
		}
		OverrideCons (String n,int i,String g)
		{
			id = i;
			name = n;
			grade = g;
		}
		OverrideCons ()
		{
			
		}
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			OverrideCons s = new OverrideCons(1,"abc","a");
			 System.out.println(s.id);
			 System.out.println(s.name);
			 System.out.println(s.grade);
			 OverrideCons s1 = new OverrideCons(1,"Abe");
			 System.out.println(s1.id);
			 System.out.println(s1.name);
			 OverrideCons s2 = new OverrideCons("abc",2,"a");
			 System.out.println(s2.id);
			 System.out.println(s2.name);
			 System.out.println(s2.grade);
			 OverrideCons s3 = new OverrideCons();
			 System.out.println(s3.id);
			 System.out.println(s3.name);
			 System.out.println(s3 .grade);

		}
		

	}
