public class Main
{
    static void AgeEligibility(int Mage,int Fage) 
    {
     if(Mage<60 || Fage<50)
     {
         throw new ArithematicException("you can't take dose as your age is not fit into the criteria");
         
     }
     else 
     {

      System.out.println("As per your age you are eligible for this criteria!");
    }
    }
    static void NationalityCheck(String nationality)
    {
        if( nationality== "Indian")
        {
          System.out.println("You are eligible for the dose");  
        }
        else
        {
            throw new RuntimeException("As per your nationality you are not eligible for the dose ");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Welcome to the Registration process!");
        AgeEligibility(45,59);
        NationalityCheck("Canada");
        System.out.println("Have a GOOD DAY!!");
    }
}