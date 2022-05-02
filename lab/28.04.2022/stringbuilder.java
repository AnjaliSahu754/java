package hello;

public class Difference {
	public static void main(String[] args)
	{
		 String s="pqr stu vw";
	
	
		StringBuilder obj=new StringBuilder("abc");
	            s.concat(" ijkl");
		   obj.append(" pqr");
		   System.out.println(s);
		   System.out.println(obj);
		
	}
}