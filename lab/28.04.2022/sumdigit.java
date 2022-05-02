package practice;

public class sumdigit {  
	 public static void main(String[] args)
	 {
		 String a;
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("Enter a alpha numberic String");
		 a=sc.nextLine();
		 int sum=0;
		 for(int i=0;i<a.length();i++)
		 {
			 if(a.charAt(i)>='0' && a.charAt(i)<='9' )
			 {
				 sum=sum+(a.charAt(i)-'0');
			 }
	 }
		 System.out.println("sum of digit="+sum);
}
}