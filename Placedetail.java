import java.util.Scanner;
class Placedetail
{
	String Name,Rollno,Email,Father_Name,Mother_Name,Address,Blood_Group;
	int Age;
	double Mobile_Number,Aadhar_Number;
	Scanner s=new Scanner(System.in);
	public void get()
	{
		System.out.println("\n\t\t NAME          : ");
		Name=s.next();
		System.out.println("\n\t\t ROLL NO       : ");
		Rollno=s.next();
		System.out.println("\n\t\t FATHER NAME   : ");
		Father_Name=s.next();
        System.out.println("\n\t\t MOTHER NAME   : ");
		Mother_Name=s.next();
        System.out.println("\n\t\t AGE           : ");
		Age=s.nextInt();
        System.out.println("\n\t\t MOBILE NUMBER : ");
		Mobile_Number=s.nextDouble();
        System.out.println("\n\t\t EMAIL         : ");
		Email=s.next();
        System.out.println("\n\t\t BLOOD GROUP   : ");
		Blood_Group=s.next();
        System.out.println("\n\t\t ADDRESS       : ");
		Address=s.next();
        System.out.println("\n\t\t AADHAR NUMBER : ");
		Aadhar_Number=s.nextDouble();
	}
	public void display()
	{
		System.out.println("\n\t\t NAME          : "+Name);
		System.out.println("\n\t\t ROLL NO       : "+Rollno);
		System.out.println("\n\t\t FATHER NAME   : "+Father_Name);
        System.out.println("\n\t\t MOTHER NAME   : "+Mother_Name);
        System.out.println("\n\t\t AGE           : "+Age);
        System.out.println("\n\t\t MOBILE NUMBER : "+Mobile_Number);
        System.out.println("\n\t\t EMAIL         : "+Email);
        System.out.println("\n\t\t BLOOD GROUP   : "+Blood_Group);
        System.out.println("\n\t\t ADDRESS       : "+Address);
        System.out.println("\n\t\t AADHAR NUMBER : "+Aadhar_Number);
	}
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Placedetail d[]=new Placedetail[100];
		int loop=1,i=0;
		while(loop==1)
		{
			System.out.println("\n\t\t-------------------------------------");
			System.out.println("\n\t\t1.ADD DETAILS");
			System.out.println("\n\t\t2.VIEW DETAILS");
			System.out.println("\n\t\t3.EXIT");
			System.out.println("\n\t\t-------------------------------------");
			System.out.println("\n\t\tENTER YOUR CHOSE : ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				     System.out.println("\n\t\tENTER STUDENT DETAIL");
					 d[i]=new Placedetail();
					 d[i].get();
					 i++;
					 break;
				case 2:
				     System.out.println("\n\t\tSTUDENT DETAILS : ");
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

 






