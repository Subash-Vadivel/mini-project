import java.util.Scanner;
class coursedetail
{
   public static  void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int semester,no_of_one_credit,no_of_value_added_course;
       String name_one_credit[]=new String[5];
       String name_value_added[]=new String[5];
       String rollnumber;
    System.out.println("\n\t\tROLL NUMBER    : ");
    rollnumber=s.next();
    System.out.println("\n\t\tSEMESTER      : ");
    semester=s.nextInt();
    System.out.println("\n\t\tNO OF ONE CREDIT COURSE COMPLETED   : ");
    no_of_one_credit=s.nextInt();
    System.out.println("\n\t\tNO OF VALUE ADDED COURSE COMPLETED     : ");
    no_of_value_added_course=s.nextInt();
    System.out.println("\n\t\tNAME OF ONE CREDIT          : ");
    name_one_credit[0]=s.next();
    
    System.out.println("\n\t\tNAME OF VALUE          : ");
    name_value_added[0]=s.next();
    
    System.out.println("\n\t\tROLL NUMBER    : "+rollnumber);
    System.out.println("\n\t\tSEMESTER      : "+semester);
    System.out.println("\n\t\tNO OF ONE CREDIT COURSE COMPLETED   : "+no_of_one_credit);
    System.out.println("\n\t\tNO OF VALUE ADDED COURSE COMPLETED     : "+no_of_value_added_course);
    System.out.println("\n\t\tNAME OF ONE CREDIT          : "+name_one_credit[0]);
    
    System.out.println("\n\t\tNAME OF VALUE          : "+name_value_added[0]);
 
   }
}
		
