import java.util.Scanner;
class coursedetail
{
   public static  void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int semester,no_of_paper_presented_inside_kec,no_of_paper_presented_outside_kec,no_of_project_presented_inside_kec,no_of_project_presented_outside_kec,priceinhackathon,priceincoding;
       String rollnumber;
    System.out.println("\n\t\tROLL NUMBER    : ");
    rollnumber=s.next();
    System.out.println("\n\t\tSEMESTER      : ");
    semester=s.nextInt();
    System.out.println("\n\t\tno_of_paper_presented_inside_kec   : ");
    no_of_paper_presented_inside_kec=s.nextInt();
    
    System.out.println("\n\t\tno_of_paper_presented_outside_kec   : ");
    no_of_paper_presented_outside_kec=s.nextInt();
    
    System.out.println("\n\t\tno_of_project_presented_inside_kec   : ");
    no_of_project_presented_inside_kec=s.nextInt();
    
    System.out.println("\n\t\tno_of_project_presented_outside_kec   : ");
    no_of_project_presented_outside_kec=s.nextInt();
    
    System.out.println("\n\t\tHACKATHON WON  : ");
    priceinhackathon=s.nextInt();
    
    System.out.println("\n\t\tCODING CARNIVAL WON: ");
    priceincoding=s.nextInt();
   
    
    System.out.println("\n\t\tROLL NUMBER    : "+rollnumber);
    System.out.println("\n\t\tSEMESTER      : "+semester);
    
    System.out.println("\n\t\tno_of_paper_presented_inside_kec   : "+no_of_paper_presented_inside_kec);   
    System.out.println("\n\t\tno_of_paper_presented_outside_kec   : "+no_of_paper_presented_outside_kec);
    
    System.out.println("\n\t\tno_of_project_presented_inside_kec   : "+no_of_project_presented_inside_kec);
    
    System.out.println("\n\t\tno_of_project_presented_outside_kec   : "+no_of_project_presented_outside_kec);
    
    System.out.println("\n\t\tHACKATHON WON  : "+priceinhackathon);
    
    System.out.println("\n\t\tCODING CARNIVAL WON: "+priceincoding);
    priceincoding=s.nextInt();
   
 
   }
}
		
