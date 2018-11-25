package defaucons;

public class VoidMainMethod {
		int id;
			String name;
			String grade;
			VoidMainMethod (int i,String n,String g)
			{
				id = i;
				name = n;
				grade = g;
			}
			VoidMainMethod (int i,String n)
			{
				id = i;
				name = n;
			}
			VoidMainMethod (String n,int i,String g)
			{
				id = i;
				name = n;
				grade = g;
			}
			VoidMainMethod ()
			{
				
			}
			void dispaly()
			{
				 System.out.println(id);
				 System.out.println(name);
				 System.out.println(grade);
			}
			
			

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				VoidMainMethod s = new VoidMainMethod(1,"abc","a");
				s.dispaly();
				 VoidMainMethod s1 = new VoidMainMethod(1,"Abe");
				 s1.dispaly();
				 VoidMainMethod s2 = new VoidMainMethod("abc",2,"a");
				 s2.dispaly();
				 VoidMainMethod s3 = new VoidMainMethod();
				 s3.dispaly();

			}
			

		}

