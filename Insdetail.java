import java.util.Scanner;
class Insdetail
{
	String Student_Name,Nominee_Name,Relationship_of_Nominee,Nominee_Occupation,Nominee_Email;
	int Age;
	double Nominee_Mobile_Number,Nominee_Aadhar_Number;
	Scanner s=new Scanner(System.in);
	public void get()
	{
		System.out.println("\n\t\tSTUDENT NAME            : ");
		Student_Name=s.next();
		System.out.println("\n\t\tNOMINEE NAME            : ");
		Nominee_Name=s.next();
		System.out.println("\n\t\tRELATIONSHIP OF NOMINEE : ");
		Relationship_of_Nominee=s.next();
        System.out.println("\n\t\tNOMINEE AGE             : ");
		Age=s.nextInt();
        System.out.println("\n\t\tNOMINEE MOBILE NUMBER   : ");
		Nominee_Mobile_Number=s.nextDouble();
        System.out.println("\n\t\tNOMINEE OCCUPATION      : ");
		Nominee_Occupation=s.next();
        System.out.println("\n\t\tNOMINEE EMAIL           : ");
		Nominee_Email=s.next();
        System.out.println("\n\t\t AADHAR NUMBER          : ");
		Nominee_Aadhar_Number=s.nextDouble();
	}
	public void display()
	{
        System.out.println("\n\t\tSTUDENT NAME            : "+Student_Name);
		System.out.println("\n\t\tNOMINEE NAME            : "+Nominee_Name);
		System.out.println("\n\t\tRELATIONSHIP OF NOMINEE : "+Relationship_of_Nominee);
        System.out.println("\n\t\tNOMINEE AGE             : "+Age);
        System.out.println("\n\t\tNOMINEE MOBILE NUMBER   : "+Nominee_Mobile_Number);
        System.out.println("\n\t\tNOMINEE OCCUPATION      : "+Nominee_Occupation);
        System.out.println("\n\t\tNOMINEE EMAIL           : "+Nominee_Email);
        System.out.println("\n\t\t AADHAR NUMBER          : "+Nominee_Aadhar_Number);
	}
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Insdetail d[]=new Insdetail[100];
		int loop=1,i=0;
		while(loop==1)
		{
			System.out.println("\n\t\t-----------------INSURANCE DETAILS--------------------");
			System.out.println("\n\t\t1.ADD DETAILS");
			System.out.println("\n\t\t2.VIEW DETAILS");
			System.out.println("\n\t\t3.EXIT");
			System.out.println("\n\t\t-------------------------------------------------------");
			System.out.println("\n\t\tENTER YOUR CHOSE : ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				     System.out.println("\n\t\tENTER INSURANCE DETAIL");
					 d[i]=new Insdetail();
					 d[i].get();
					 i++;
					 break;
				case 2:
				     System.out.println("\n\t\tINSURANCE DETAILS : ");
					 for(int j=0;j<i;j++)
					 {
						 d[j].display();
					 }
					 break;
				case 3:
				     loop=0;
					 break;
				default:
				     System.out.println("\n\t\t--------INVALID CHOSE-------");
			}
		}
	  
	}
}

 




