package practice;

public class reverse {
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();

    

        StringBuffer sbfr = new StringBuffer(a);

       

       sbfr.reverse(); 
       System.out.println(sbfr);

       
	}

}
